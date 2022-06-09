package Multithreading;

public class TestThread1 extends Thread{
    @Override
    public void run() {
        //run方法线程

        for(int i=0;i<20;i++){
            System.out.println("我在看代码--"+i);
        }
    }

    public static void main(String[] args) {
        //main线程，主线程
        TestThread1 testThread1 = new TestThread1();
        //调用start（）方法开启线程
        testThread1.start();
        for (int i=0;i<3000;i++){
            System.out.println("我在学习多线程--"+i);
        //两个线程交替执行，CPU负责调度
        }
    }
}
