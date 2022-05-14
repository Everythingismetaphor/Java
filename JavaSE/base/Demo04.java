package JavaSE.base;

public class Demo04 {
    public static void main(String[] args) {
        int i = 128;
        //强制转换（类型）变量名  高--低
        byte b = (byte)i;//内存溢出
        //自动转换（类型）变量名  低--高
        double d = i;
        System.out.println(i);
        System.out.println(b);
        System.out.println(d);

        /*
        注意点：
        1.不能对布尔值进行转换
        2.不能把对象类型转换为不相干的类型
        3.在把高容量转换到低容量的时候，强制转换
        4.转换的时候可能存在内存溢出，或者精度问题
         */
    }
}
