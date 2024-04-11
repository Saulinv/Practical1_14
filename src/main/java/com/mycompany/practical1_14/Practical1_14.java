

package com.mycompany.practical1_14;

import java.io.IOException;


public class Practical1_14 {
    public static void main(String[] args) {
        System.out.println("Practical 1.14 Saulin Ivan RIBO-01-22 Variant 4");
        Thread thread0 = new Thread(new MyRunnable(), "Thread-0");
        Thread thread1 = new Thread(new MyRunnable(), "Thread-1");

        thread0.start();
        thread1.start();

        
        try {
            System.in.read();
            
        } catch (IOException ex) {
        ex.getMessage();
        }

        
        thread0.interrupt();
        thread1.interrupt();
    }
}
