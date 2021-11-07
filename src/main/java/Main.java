
public class Main {
    public static void main(String[] args) {

        Toy toy = new Toy();

        Thread user = new Thread(null, toy::tumblerOn);
        Thread uselessToy = new Thread(null, toy::tumblerOff);

        user.start();
        uselessToy.start();
        try {
            user.join();
            uselessToy.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

