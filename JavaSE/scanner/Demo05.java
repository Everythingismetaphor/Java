package JavaSE.scanner;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        //输入多个数字，求其总和与平均数，每输入一个用回车确认，输入非数字结束并输出结果
       Scanner scanner = new Scanner(System.in);
       double sum = 0;
       int m = 0;
        System.out.println("请输入数字：");

       while (scanner.hasNextDouble()){

           double x = scanner.nextDouble();
           m++;
           sum = sum + x;
       }
        System.out.println("输入的数字个数为："+m);
        System.out.println("输入的数字和为："+sum);
        System.out.println("输入数字的平均数为："+sum/m);

       scanner.close();
    }
}
