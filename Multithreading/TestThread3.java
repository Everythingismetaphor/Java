package Multithreading;

import javax.management.relation.RoleInfoNotFoundException;

//创建线程方式2：实现runnable接口，重写run方法，执行线程需要丢入runnable接口实现类，调用start方法
public class TestThread3 implements Runnable {
    @Override
    public void run() {
        //run方法线程

        for(int i=0;i<20;i++){
            System.out.println("我在看代码--"+i);
        }
    }

    public static void main(String[] args) {
        /*
        //main线程，主线程
        TestThread1 testThread1 = new TestThread1();
        //调用start（）方法开启线程
        testThread1.start();
         */

        //创建runnable接口的实现类对象
        TestThread3 testThread3 = new TestThread3();
        Thread thread = new Thread(testThread3);
        thread.start();
//        new Thread(testThread3).start();

        //创建线程对象，通过线程对象来开启我们的线程代理
        for (int i=0;i<30;i++){
            System.out.println("我在学习多线程--"+i);
            //两个线程交替执行，CPU负责调度
        }
    }
}
