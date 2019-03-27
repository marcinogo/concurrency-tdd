package com.ja.app;

/**
 * @author Marcin Ogorzalek
 */
public class FunWithThreadsNames {
    public static void main(String[] args) {
        new MyThread("ThreadExtend").start();
        new Thread(new MyRunnable("RunnableImplement")).start();
        new Thread(new MyRunnable("Other RunnableImpl")).start();
    }

    static class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println(this.getName());
        }
    }

    static class MyRunnable implements Runnable {
        private String name;

        public MyRunnable(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(name);
        }
    }
}
