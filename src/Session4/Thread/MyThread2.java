package Session4.Thread;

public class MyThread2 implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("Thread 2: " + i);
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        System.out.print(e.getMessage());
      }
    }
  }
}
