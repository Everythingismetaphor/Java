package JavaSE.operator;

public class Demo03 {
    public static void main(String[] args) {
        //++ --自增，自减   一元操作符
        int a = 3;
        int b = a++;    //先赋值，再执行a=a+1
        int c = ++a;    //先执行a=a+1，再赋值

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //幂运算 2^3
        //alt+回车
        double pow = Math.pow(2, 3);
        System.out.println(pow);


    }
}
