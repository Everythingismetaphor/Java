package JavaSE.method;

public class Demo01 {
    //java方法是语句的集合，它们在一起执行一个功能
    //设计方法的原则： 原子性，一个方法值完成1个功能，这样利于我们后期的拓展
    //main方法  viod没有返回值
    public static void main(String[] args) {
       int sum = add(1,4);
        System.out.println(sum);
    }
    //加法  int返回值类型
    public static int add(int a,int b){
        return a+b;
    }
}
