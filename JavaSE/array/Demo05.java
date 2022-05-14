package JavaSE.array;

import java.util.Arrays;

public class Demo05 {
    public static void main(String[] args) {
        int[] a={2,5,200,412,512,54};

        System.out.println(a);
        //打印数组元素Arrays.toString
        System.out.println(Arrays.toString(a));
        //数组排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //数组填充 左闭右开，不包括最后一个。
        Arrays.fill(a,0,3,0);
        System.out.println(Arrays.toString(a));
    }
}
