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
                    System.out.println("The Tortiose is at Start Line");
                    break;
                case 1:
                    System.out.println("The Tortoise is at Cool River");
                    break;
                case 2:
                    System.out.println("The Tortoise is at Mountain Hills");
                    break;
                case 3:
                    System.out.println("The Tortoise is at Oak tree");
                    break;
                case 4:
                    System.out.println("The Tortoise is at Finish line");
                    break;
            }
            if (index != 4) {
                try {
                    Thread.sleep(3000);
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
