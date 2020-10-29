package thread.tortoise;

public class Tortoise extends Thread {
    public Tortoise() {
        super("Tortoise");
    }
    private final int MILESTONE=5;
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
        }
    }
}
