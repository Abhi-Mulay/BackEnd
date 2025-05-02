package Date_07_02_2_25;
import java.util.*;

class Player implements Runnable {
    private String name;
    private int position = 0;
    private static final int FINISH_LINE = 100;
    private static boolean raceOver = false;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (position < FINISH_LINE && !raceOver) {
            position += random.nextInt(5) + 1;
            System.out.println(name + " moved to position: " + position);
            
            if (position >= FINISH_LINE) {
                raceOver = true;
                System.out.println(name + " wins the race!");
            }
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Q2_RaceGame {
    public static void main(String[] args) {
        Thread player1 = new Thread(new Player("katen"));
        Thread player2 = new Thread(new Player("aniket"));
        Thread player3 = new Thread(new Player("ram"));

        player1.start();
        player2.start();
        player3.start();

        try {
            player1.join();
            player2.join();
            player3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Race is over!");
    }
}
