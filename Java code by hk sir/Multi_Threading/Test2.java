/*
 * Develop a multithread program to run two tasks concurrently
 * - task #1: print numbers 1 - 20
 * - task #2: print numbers 20 - 1
 */

class MyThread extends Thread {
   @Override
   public void run() {
      for (int i = 20; i >= 1; i--) {
         System.out.println("run: " + i);
      }
      System.out.println("run end");
   }
}

public class Test2 {
   public static void main(String[] args) {
      MyThread mt = new MyThread();
      mt.start();

      // task #1
      for (int i = 1; i <= 20; i++) {
         System.out.println("main: " + i);
      }
      System.out.println("main end");
   }
}