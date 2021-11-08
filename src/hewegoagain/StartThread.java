package hewegoagain;

public class StartThread {
    public static void main(String[] args) {
       NewThread tr = new NewThread();
        try {
            System.out.println(Thread.currentThread());
            for (int i = 0; i < 5; i++) {
                System.out.println("Father flow");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
