package Multithreading;
class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Thread " + Thread.currentThread().getId() + " is running from thread class" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Thread " + Thread.currentThread().getId() + " is running from runnable interface " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();  
        MyThread thread2 = new MyThread();  
        thread1.start();  
        thread2.start();
        MyRunnable runnable = new MyRunnable();
        Thread thread3 = new Thread(runnable);
        thread3.start();
        System.out.println("Main Thread is running");
    }   
}
