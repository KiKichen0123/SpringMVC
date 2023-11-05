package com.mvc.bean;

import java.util.Arrays;

/**
 * 该程序的说明如下：
 */
public class ShortPath {
    public static void dijkstra(int[][] graph, int start) {
        int numVertices = graph.length;
        int[] distance = new int[numVertices];
        boolean[] visited = new boolean[numVertices];
        int[] parent = new int[numVertices];

        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] = 0;

        for (int i = 0; i < numVertices - 1; i++) {
            int minDistance = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int v = 0; v < numVertices; v++) {
                if (!visited[v] && distance[v] < minDistance) {
                    minDistance = distance[v];
                    minIndex = v;
                }
            }

            visited[minIndex] = true;

            for (int v = 0; v < numVertices; v++) {
                int edgeWeight = graph[minIndex][v];
                if (!visited[v] && edgeWeight != 0 && distance[minIndex] != Integer.MAX_VALUE &&
                        distance[minIndex] + edgeWeight < distance[v]) {
                    distance[v] = distance[minIndex] + edgeWeight;
                    parent[v] = minIndex;
                }
            }
        }

        printShortestPaths(start, distance, parent);
    }

    public static void printShortestPaths(int start, int[] distance, int[] parent) {
        int numVertices = distance.length;
        System.out.println("Shortest paths from vertex A to all other vertices:");
        for (int v = 0; v < numVertices; v++) {
            System.out.print("Vertex " + (char) ('A' + v) + " (Distance: " + distance[v] + "): ");
            printPath(start, v, parent);
            System.out.println();
        }
    }

    public static void printPath(int start, int end, int[] parent) {
        if (end == start) {
            System.out.print((char) ('A' + start));
        } else if (parent[end] == -1) {
            System.out.print("No path from A to " + (char) ('A' + end));
        } else {
            printPath(start, parent[end], parent);
            System.out.print(" -> " + (char) ('A' + end));
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 3, 1, 7, 0, 0},
                {3, 0, 3, 2, 0, 2},
                {1, 3, 0, 5, 0, 0},
                {7, 2, 5, 0, 2, 5},
                {0, 0, 0, 2, 0, 1},
                {0, 2, 0, 5, 1, 0}
        };

        dijkstra(graph, 0);
    }
}