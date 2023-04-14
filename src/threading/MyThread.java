package threading;

public class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is Running...");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread is done...");
    }

    public  static void main(String args[]){
        MyThread th = new MyThread();
        System.out.println("Thread is in new State...");
        th.start();
        System.out.println("Thread is in runnable state...");

        try {
            th.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread is terminated...");
    }
}
