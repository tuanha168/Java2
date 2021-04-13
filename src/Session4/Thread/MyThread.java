package Session4.Thread;

public class MyThread extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("Thread 1: " + i);
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        System.out.print(e.getMessage());
      }
    }
  }
}
