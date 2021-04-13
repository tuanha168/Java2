package Session4.Thread;

public class demoThread {
  public static void main(String[] args) {
    MyThread t1 = new MyThread();
    MyThread2 thread2 = new MyThread2();
    Thread t2 = new Thread(thread2);
    t1.start();
    t2.start();

    System.out.println("main thread");
  }
}
