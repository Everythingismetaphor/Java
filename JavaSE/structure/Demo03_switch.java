package JavaSE.structure;

import java.util.Scanner;

public class Demo03_switch {
    //switch case 语句判断一个变量与一系列值中某个值是否相等，每个值称为一个分支
    //匹配一个具体值。注意结尾要加break语句
    public static void main(String[] args) {
        System.out.println("请输入成绩（A,B,C,D）:");
        Scanner scanner =  new Scanner(System.in);
        String s = scanner.nextLine();

        switch (s){
            case "A":
                System.out.println("优秀");break;
            case "B":
                System.out.println("良好");break;
            case "C":
                System.out.println("及格");break;
            case "D":
                System.out.println("不及格");break;
        }


        scanner.close();

    }
}
