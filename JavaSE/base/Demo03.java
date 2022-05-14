package JavaSE.base;

public class Demo03 {
    public static void main(String[] args) {
        //整数拓展： 进制  二进制0b，十进制，八进制0，十六进制0x
        int i1 = 10;
        int i2 = 010;
        int i3 = 0x10;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        //====================================
        //浮点数拓展  银行业务
        //BigDecimal类 数学工具
        //====================================
        //float double 有限，离散，有舍入误差，接近但是不等于
        //最好不要用浮点数进行比较
        //最好不要用浮点数进行比较
        //最好不要用浮点数进行比较
        float f = 0.1f;
        double d = 1.0/10;
        System.out.println(f==d);//false

        //====================================
        //字符拓展
        //====================================
        char c1 = 'A';
        char c2 = '中';

        System.out.println(c1);
        System.out.println((int)c1); //强制类型转化
        System.out.println(c2);
        System.out.println((int)c2);
        //所有的字符本质还是数字
        //编码Unicode U0000-UFFFF
        char c3 = '\u0061';
        System.out.println(c3);
        //转义字符  \t \n

        //布尔值拓展
        boolean flag = true;



    }
}
