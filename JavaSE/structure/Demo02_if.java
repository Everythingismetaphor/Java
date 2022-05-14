package JavaSE.structure;

import java.util.Scanner;

public class Demo02_if {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("是否购买这个商品？(y or n)");
        String s = scanner.nextLine();
        if(s.equals("y")){
            System.out.println("购买成功！");

        }
        else if (s.equals("n")){
            System.out.println("购买失败!");
        }
        scanner.close();
    }
}
