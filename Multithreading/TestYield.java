package Multithreading;

import javax.swing.plaf.TableHeaderUI;

public class TestYield {
    public static void main(String[] args) {
        MyYield myYield = new MyYield(); //对象

        new Thread(myYield,"a").start();//线程
        new Thread(myYield,"b").start();//线程

    }


}

//线程类
class MyYield implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始执行");
        Thread.yield();//礼让
        System.out.println(Thread.currentThread().getName()+"线程停止执行");


    }
}
