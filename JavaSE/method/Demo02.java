package JavaSE.method;

public class Demo02 {
    //修饰符 返回值类型 方法名（参数类型 参数名）
    // 形参，实参

    //调用方法：对象名.方法名（实参列表）
    //java支持两种调用方法的方式
    //1.当方法返回一个值得时候，方法调用通常被当做一个值
    //2.如果方法返回的是void，方法调用是一条语句
    public static void main(String[] args) {
        max(5,20);
    }
     //比大小
     public static int max(int a,int b){
        int result = 0;
        if(a>b){
            System.out.println(a);
        }
        if(a==b){
            System.out.println("两个数相等");
        }
        if(a<b){
            System.out.println(b);
        }


        return 0;//终止方法
        }
        //值传递（java），引用传递

}
