package Multithreading;
//多线程不安全，要添加同步方法
public class TestSafe implements Runnable{
    int num = 10;
    @Override
    public void run() {

        while (true) {
            //将资源放到同步块中
            synchronized ("") {
                if (num > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        }
                    System.out.println("tickets" + num--);
                } else break;
            }
        }
    }

    public static void main(String[] args) {
        TestSafe t = new TestSafe();//实例化对象
        Thread A = new Thread(t);
        Thread B = new Thread(t);
        Thread C = new Thread(t);
        Thread D = new Thread(t);
        A.start();
        B.start();
        C.start();
        D.start();

    }
}
