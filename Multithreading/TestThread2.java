package Multithreading;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.TreeMap;
//练习Thread，实现多线程同步下载图片
public class TestThread2 extends Thread {

    private String url;
    private String name;
    //构造器
    public TestThread2(String url,String name){
        this.url=url;
        this.name=name;

    }
//下载图片的执行体
    @Override
    public void run() {
        Webdownloader webdownloader = new Webdownloader();
        webdownloader.download(url,name);
        System.out.println("下载了文件名为"+name);
    }
//主线程
    public static void main(String[] args) {
        TestThread2 t1 = new TestThread2("https://img1.baidu.com/it/u=809054463,2167009386&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=281","1.jpg");
        TestThread2 t2 = new TestThread2("https://img2.baidu.com/it/u=4084621093,2971972319&fm=253&fmt=auto&app=120&f=JPEG?w=889&h=500","2.jpg");
        TestThread2 t3 = new TestThread2("https://img2.baidu.com/it/u=2933310183,1119304250&fm=253&fmt=auto&app=120&f=JPEG?w=889&h=500","3.jpg");
        TestThread2 t4 = new TestThread2("https://img1.baidu.com/it/u=2863108920,4275403644&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=281","4.jpg");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
//下载器
class Webdownloader{
    //下载方法
    public void download(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，download出现异常");
        }

    }


}