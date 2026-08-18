package dsa.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MinTimeToInfectNetwork {
    public static void main(String[] args) {
        // ====================================================================
        // USE-CASE 1: Fully Connected Network
        // ====================================================================
        /*
         * Network Structure (5 Users: 0, 1, 2, 3, 4):
         *       [0] ─── [1] ─── [2]
         *        │               │
         *       [3] ─────────── [4]
         *
         * Start User: 0
         * Expected Time: 2 Minutes
         * Minute 0: [0]
         * Minute 1: [1, 3]
         * Minute 2: [2, 4]
         */

        System.out.println("==================================================");
        System.out.println("🧪 USE-CASE 1: Fully Connected Network");
        System.out.println("==================================================");

        int n1 = 5;
        List<List<Integer>> adj1 = new ArrayList<>();
        for (int i = 0; i < n1; i++)
            adj1.add(new ArrayList<>());

        addFriendship(adj1, 0, 1);
        addFriendship(adj1, 0, 3);
        addFriendship(adj1, 1, 2);
        addFriendship(adj1, 3, 4);
        addFriendship(adj1, 2, 4);

        int time1 = minTimeToInfectNetwork(n1, adj1, 0);
        System.out.println("👉 Total Time Taken: " + time1 + " Minutes\n");

        // ====================================================================
        // USE-CASE 2: Network with Disconnected User / Isolated Group
        // ====================================================================
        /*
         * Network Structure (6 Users: 0 to 5):
         *       [0] ─── [1] ─── [2]       [4] ─── [5]
         *        │                       (Isolated Group)
         *       [3]
         *
         * Start User: 0
         * Expected Time: 2 Minutes (for reachable network)
         * Note: Users 4 & 5 will NEVER get infected!
         */
        System.out.println("==================================================");
        System.out.println("🧪 USE-CASE 2: Disconnected Component (Isolated Users)");
        System.out.println("==================================================");

        int n2 = 6;
        List<List<Integer>> adj2 = new ArrayList<>();
        for (int i = 0; i < n2; i++) adj2.add(new ArrayList<>());

        // Component 1
        addFriendship(adj2, 0, 1);
        addFriendship(adj2, 0, 3);
        addFriendship(adj2, 1, 2);

        // Component 2 (Isolated from Component 1)
        addFriendship(adj2, 4, 5);

        int time2 = minTimeToInfectNetwork(n2, adj2, 0);
        System.out.println("👉 Total Time Taken: " + time2 + " Minutes\n");

        // ====================================================================
        // USE-CASE 3: Single Isolated Node (No Friends)
        // ====================================================================
        /*
         * Network Structure (1 User):
         *       [0] (Alone)
         *
         * Start User: 0
         * Expected Time: 0 Minutes (Already infected at start, nowhere to spread)
         */
        System.out.println("==================================================");
        System.out.println("🧪 USE-CASE 3: Single User / Isolated Node");
        System.out.println("==================================================");

        int n3 = 1;
        List<List<Integer>> adj3 = new ArrayList<>();
        adj3.add(new ArrayList<>());

        int time3 = minTimeToInfectNetwork(n3, adj3, 0);
        System.out.println("👉 Total Time Taken: " + time3 + " Minutes");
        System.out.println("==================================================");

    }

    // 🛠️ Helper Function to Add Edge (Undirected Friendship)
    public static void addFriendship(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static int minTimeToInfectNetwork(int numUsers, List<List<Integer>> adj, int startUser){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] infected = new boolean[numUsers];

        queue.add(startUser);
        infected[startUser] = true;

        int minutes = 0;

        while(!queue.isEmpty()){
            int size = queue.size();
            boolean newInfectionThisMinute = false;

            for(int i=0; i<size; i++){
                int currentUser = queue.poll();

                for(int friend : adj.get(currentUser)){
                    if(!infected[friend]){
                        infected[friend] = true;
                        queue.add(friend);
                        newInfectionThisMinute = true;
                    }


                }
            }

            if(newInfectionThisMinute){
                minutes++;
            }
        }
        return minutes;
    }
}
