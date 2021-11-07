public class Toy {

    private final int numberOfAttempts = 5;
    private final int SLEEP = 3000;
    private volatile boolean tumbler = false;

    public void tumblerOn() {
        for (int i = 0; i < numberOfAttempts; i++) {
            if (!tumbler) {
                tumbler = true;
                System.out.println("Пользователь включил тумблер");
            }
            try {
                Thread.sleep(SLEEP);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void tumblerOff() {
        while (!Thread.currentThread().isInterrupted()) {
            if (tumbler) {
                tumbler = false;
                System.out.println("Игрушка выключила тумблер");
            }
        }
    }
}


