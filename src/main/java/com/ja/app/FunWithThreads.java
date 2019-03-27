package com.ja.app;

/**
 * @author Marcin Ogorzalek
 */
public class FunWithThreads {
    public static void main(String[] args) {
        new Thread(new MyRunnableThread()).start();
        new MyThreadThread().start();

        new Thread(() -> {
            System.out.println("Hello from LambdaThread (anonymous Thread)");
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous Runnable");
            }
        }).start();
    }

    static class MyRunnableThread implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello from Runnable implementation");
        }
    }

    static class MyThreadThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello from subclass of Thread");
        }
    }
}
