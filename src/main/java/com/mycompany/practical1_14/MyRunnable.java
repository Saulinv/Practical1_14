
package com.mycompany.practical1_14;


public class MyRunnable implements Runnable {
    
    private static final Object lock = new Object();
    private static boolean threadZeroTurn = true;
    
    @Override
        public void run() {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    synchronized (lock) {
                         if ((Thread.currentThread().getName().equals("Thread-0") && threadZeroTurn) ||
                            (Thread.currentThread().getName().equals("Thread-1") && !threadZeroTurn)) {
                            System.out.println(Thread.currentThread().getName());
                            threadZeroTurn = !threadZeroTurn;
                            lock.notify(); 
                        } else {
                            lock.wait();
                        }
                    }
                }
            } catch (InterruptedException ex) {
                
            }
    }
}