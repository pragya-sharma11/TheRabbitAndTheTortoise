package thread.tortoise;

public class Tortoise extends Thread {
    public Tortoise() {
        super("Tortoise");
    }
    private final int MILESTONE=5;
}
