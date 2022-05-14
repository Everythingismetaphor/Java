package JavaSE.operator;

public class Demo02 {
    public static void main(String[] args) {
        long a = 34242524114234L;
        int b = 123;
        short c= 21;
        byte d = 8;

        System.out.println(a+b+c+d);  //long 有long就是long
        System.out.println(b+c+d);   //int
        System.out.println(c+d);     //int
    }
}
