package dsa.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopologicalSort {
    public static void main(String[] args) {
        int numNodes = 6;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numNodes; i++) adj.add(new ArrayList<>());

        /*
         * Graph Edges:
         * 5 -> 0, 5 -> 2
         * 4 -> 0, 4 -> 1
         * 2 -> 3
         * 3 -> 1
         */
        adj.get(5).add(0);
        adj.get(5).add(2);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        List<Integer> result = topologicalSortBFS(numNodes, adj);

        System.out.println("==========================================");
        System.out.println("🔄 Topological Sort Result (Kahn's Algo BFS):");
        System.out.println("==========================================");
        System.out.println(result);
        System.out.println("==========================================");

    }

    public static List<Integer> topologicalSortBFS(int numNodes, List<List<Integer>> adj){
        int[] indegree = new int[numNodes];

        //1. calculate in-order of every node
        for(int u=0; u<numNodes ; u++){
            for (int v : adj.get(u)) {
                indegree[v]++; // Arrow u -> v means v has incoming edge
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        //2. filing queue with nodes having indegree=0
        for(int u=0; u<numNodes ; u++){
            if(indegree[u]==0){
                queue.add(u);
            }
        }

        List<Integer> topoOrder = new ArrayList<>();

        //3. Stating BFS
        while(!queue.isEmpty()){
            int currentNode = queue.poll();
            topoOrder.add(currentNode);

            // Reduce in-degree for adjacent nodes
            for(int v: adj.get(currentNode)){
                indegree[v]--;
                if(indegree[v]==0){
                    queue.add(v);
                }
            }
        }

        //4. Cycle check: If topoOrder size != total nodes, Cycle exists!
        if(topoOrder.size() != numNodes){
            //cycle exist
            System.out.println("Cycle Detected !!!");
            return new ArrayList<>();
        }

        return topoOrder;
    }
}
