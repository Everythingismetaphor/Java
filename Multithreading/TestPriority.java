package Multithreading;

import javax.swing.*;

public class TestPriority  {
    public static void main(String[] args) {
        //主线程默认优先级
        System.out.println(Thread.currentThread().getName()+"-->"+Thread.currentThread().getPriority());
        //对象
        Mypriority myPriority = new Mypriority();

        Thread t1 = new Thread(myPriority);
        Thread t2 = new Thread(myPriority);
        Thread t3 = new Thread(myPriority);
        Thread t4 = new Thread(myPriority);

        //设置优先级(1-10)
        t1.start();
        t2.setPriority(1);
        t2.start();
        t3.setPriority(Thread.MAX_PRIORITY );
        t3.start();
        t4.setPriority(Thread.MIN_PRIORITY );
        t4.start();

    }
}

class Mypriority implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->"+Thread.currentThread().getPriority());

    }
}