package Multithreading;
//多个线程同时操作同一个对象
//买火车票的例子

//多个线程操作同一个资源的情况下，数据不安全
public class TestThread4 implements Runnable{
    //票数
    private int ticketNums = 10;

    @Override
    public void run() {

        while (true){
            if (ticketNums<=0)
            {
                break;
            }
            //模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //获取当前线程执行的名字

            System.out.println(Thread.currentThread().getName()+"-->拿到了第"+ticketNums+"票");
            ticketNums--;}
    }

    public static void main(String[] args) {
        TestThread4 ticket = new TestThread4();

        new Thread(ticket,"小红").start();
        new Thread(ticket,"小明").start();
        new Thread(ticket,"小南").start();
    }
}
