package Multithreading;
//join合并线程，待此线程执行完成后，再执行其他线程，其他线程阻塞
//可以想象成插队
public class TestJoin implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程join"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        //启动线程
        TestJoin testJoin = new TestJoin();

        Thread thread = new Thread(testJoin);
        thread.start();

        //主线程
        for (int i = 0; i < 100; i++) {
            if (i==20){
                thread.join();
            }
            System.out.println("main"+i);
        }
    }
}
