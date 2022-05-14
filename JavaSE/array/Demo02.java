package JavaSE.array;

public class Demo02 {
    //数组的三种初始化
    public static void main(String[] args) {
    //1.静态初始化
        int[] a = {1,2,3,4,5};
        System.out.println(a[0]);
    //2.动态初始化,包含默认初始化0
        int[] b =new int[10];
        b[0]=10;
        System.out.println(b[0]);

    }
}
