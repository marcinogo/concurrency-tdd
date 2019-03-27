package com.ja.app;

/**
 * @author Marcin Ogorzalek
 */
public class FunWithThreadsNames {
    public static void main(String[] args) {
        new MyThread("ALA").start();
        new Thread(new MyRunnable("MA", 100)).start();
        new Thread(new MyRunnable("KOTA")).start();
    }

    static class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.getMessage();
            }
            System.out.println(this.getName());
        }
    }

    static class MyRunnable implements Runnable {
        private String name;
        private int sleepTime;

        public MyRunnable(String name) {
            this.name = name;
        }

        public MyRunnable(String name, int sleepTime) {
            this.name = name;
            this.sleepTime = sleepTime;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.getMessage();
            }
            System.out.println(name);
        }
    }
}
