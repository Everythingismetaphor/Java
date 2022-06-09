package Multithreading;
//死锁：多个线程互相占有对方需要的资源，然后互相僵持
public class DeadLock {
    public static void main(String[] args) {
        Makeup g1 = new Makeup(0,"灰姑娘");
        Makeup g2 = new Makeup(1,"白雪公主");

        g1.start();
        g2.start();
    }


}
//口红
class Lipstick{

}
//镜子
class Mirror{


}

class Makeup extends Thread {
    //需要的资源只有一份，用static保证
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    int choice;
    String girl;
//构造方法
    Makeup(int choice,String girl){
        this.choice=choice;
        this.girl=girl;
    }

    @Override
    public void run() {
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void makeup() throws InterruptedException {
        if (choice == 0){
            synchronized (lipstick){
                System.out.println(this.girl+"获得了口红的锁");
                Thread.sleep(1000);
//                synchronized (mirror){//一秒钟后想获得镜子
//                    System.out.println(this.girl+"获得了镜子获得的锁");

                }    synchronized (mirror){//一秒钟后想获得镜子
                    System.out.println(this.girl+"获得了镜子获得的锁");


                }
        }else{
            synchronized (mirror){
                //获得镜子的锁
                System.out.println(this.girl+"获得了镜子的锁");
                Thread.sleep(2000);
//                synchronized (lipstick){
//                    //两秒钟后想获得口红
//                    System.out.println(this.girl+"获得了口红的锁");
                }
                synchronized (lipstick){
                    //两秒钟后想获得口红
                    System.out.println(this.girl+"获得了口红的锁");
            }
        }
    }
}