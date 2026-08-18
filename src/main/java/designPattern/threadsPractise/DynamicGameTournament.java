package designPattern.threadsPractise;

import java.util.concurrent.Phaser;

public class DynamicGameTournament {

    public static void main(String[] args) {
        // Initializing phaser with 1 (Main thread registers itself)
        Phaser phaser = new Phaser(1);

        System.out.println("Tournament starting...");

        // Creating 3 Player Threads
        for (int i = 1; i <= 3; i++) {
            phaser.register(); // Dynamic registration of a new thread
            final String playerName = "Player-" + i;

            new Thread(() -> {
                System.out.println(playerName + " joined Round 1.");
                phaser.arriveAndAwaitAdvance(); // Arrive at checkpoint and wait for others

                System.out.println(playerName + " enters Round 2.");

                // Specific condition: Player 3 decides to quit the tournament here
                if (playerName.equals("Player-3")) {
                    System.out.println(playerName + " is leaving the tournament.");
                    phaser.arriveAndDeregister(); // Dynamically deregister! Count decreases.
                    return;
                }

                phaser.arriveAndAwaitAdvance(); // Remaining players wait again
                System.out.println(playerName + " enters the Grand Final Round!");
            }).start();
        }

        // Main thread releases the initial lock to trigger Round 1
        phaser.arriveAndDeregister();
    }
}
