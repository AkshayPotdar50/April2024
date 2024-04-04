package com.java.array;

class MyThread extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName() +"is running");

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {

        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName() +"is running");

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}

public class Multithread {
    public static void main(String[] args) {
        MyThread thread1= new MyThread();
        thread1.setName("Thread 1");

        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.setName("thread 2");

        thread1.start();
        thread2.start();
    }

}
