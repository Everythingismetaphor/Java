package JavaSE.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入数据：");

            String str = scanner.nextLine();
            System.out.println("输出的内容为："+str);


        //凡是属于IO流的类如果不关闭会一直占有资源，要养成好习惯，用完就关
        scanner.close();

    }
}
