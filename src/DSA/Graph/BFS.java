package DSA.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        int V = 5; // number of vertices

        // Create adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges (undirected graph)
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(2).add(0);
        adj.get(2).add(4);
        adj.get(3).add(1);
        adj.get(4).add(2);

        System.out.println("BFS Traversal starting from node 0:");
        bfs(0, adj, V);
    }

    public static void bfs(int start, List<List<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;

        queue.add(start);

        while(!queue.isEmpty()) {
            int node = queue.poll();
            System.out.println(node + " ");

            for(int neighbor : adj.get(node)) {
                if(!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}
