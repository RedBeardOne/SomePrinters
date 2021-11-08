package hewegoagain;

public class NewThread implements Runnable {
    Thread the;

    NewThread() {



        the = new Thread(this, "Demo");
        System.out.println("Son created " + the);
        the.start();
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Flow son");
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Broken son");
        }
        System.out.println("Flow son ended");
    }
}
