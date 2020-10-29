package thread.tortoise;

import javax.swing.*;

public class Tortoise extends Thread {
    private final int MILESTONE = 5;

    public Tortoise() {
        super("Tortoise");
    }

    public void run() {
        for (int index = 0; index < MILESTONE; index++) {
            switch (index) {
                case 0:
                    System.out.println("The Tortiose has started from Start Line!");
                    break;
                case 1:
                    System.out.println("The Tortoise has reached the Cool River!");
                    break;
                case 2:
                    System.out.println("The Tortoise has reached the Mountain Hills!");
                    break;
                case 3:
                    System.out.println("The Tortoise has reached the Big Oak tree!");
                    break;
                case 4:
                    System.out.println("The Tortoise has reached the Finish line!");
                    break;
            }
            if (index != 4) {
                try {
                    Thread.sleep(3000L);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
        JOptionPane.showMessageDialog(
                null,
                "The Tortoise has Completed The Race!!!",
                "Tortoise",
                JOptionPane.PLAIN_MESSAGE
        );
    }
}
