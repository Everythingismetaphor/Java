package JavaSE.method;

public class Demo06 {
    //递归就是A方法调用A方法，自己调用自己
    //递归结构包括两个部分：
    //递归头：什么时候不调研自身的方法。如果没有头，将陷入死循环
    //递归体：什么时候需要调用自身方法
    public static void main(String[] args) {
        int a=f(4);
        System.out.println(a);

    }
    //计算阶乘
    public static int f(int n){
        int result=1;
        if (n!=1){
            return n*f(n-1);

        }
        else return 1;

    }

}
