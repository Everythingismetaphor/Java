package Multithreading;

import javax.swing.*;
import java.awt.*;

public class JoinTest extends JFrame {
    private Thread threadA;
    private Thread threadB;

    final JProgressBar progressBar = new JProgressBar();
    final JProgressBar progressBar2 = new JProgressBar();

    int count = 0;

    public static void main(String[] args) {
        init(new JoinTest(),100,100);
    }
    public JoinTest(){
        super();
        getContentPane().add(progressBar, BorderLayout.NORTH);
        getContentPane().add(progressBar2, BorderLayout.SOUTH);
        progressBar.setStringPainted(true);
        progressBar2.setStringPainted(true);

        //使用匿名内部类形式初始化Thread实例
        threadA = new Thread(new Runnable(){
            int count = 0;
            public void run(){
                while(true){
                    progressBar.setValue(++count);
                    try {
                        Thread.sleep(100);
                        if(count==18){
                        threadB.join();}
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        });
        threadA.start();
//        ThreadB = new Thread(new Runnable() {
//            int count = 0;
//            public void run(){
//                while(true){
//                    progressBar2.setValue(++count);
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    if (count==100)
//                        break;
//                }
//            }
//        });
        threadB = new Thread(new Runnable(){
            int count = 0;
            public void run(){
                while(true){
                    progressBar2.setValue(++count);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(count==100)
                        break;
                }
            }

        });
        threadB.start();
    }

    public static void init (JFrame frame,int width, int height){
        // 初始化程序界面的方法
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible (true);

    }
}
