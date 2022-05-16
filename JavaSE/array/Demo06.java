package JavaSE.array;

import java.util.Arrays;

public class Demo06 {
    //冒泡排序   总共有八大排序算法
    //两层循环。外层冒泡轮数，里层一次比较。
    //1.比较数组中，两个相邻的元素。如果第一个数比第二个数大，就交换他们的位置
    //2.每一次比较，都会产生出一个最大，或最小的数字。
    //3.下一轮减少一次排序。
    //4.一次循环，直到结束。
    public static void main(String[] args) {
     int[] a ={1,4,5,6,7,45,21,2,3,22};
     int[] sort = sort(a);
        System.out.println(Arrays.toString(sort));
        }
        public static int[] sort(int[] array){
            int temp = 0;
            //外层循环，判断走多少次；
            for(int i=0;i<array.length-1;i++ ){
                boolean flag =false;//通过flag标识位减少没有意义的比较
                for (int j=0;j<array.length-1-i;j++){
                    if(array[j+1]>array[j]){
                        temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                        flag=true;
                    }
                }
                if(flag==false)break;;
            }
            return array;
        }

}
