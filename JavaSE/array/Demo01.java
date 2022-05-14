package JavaSE.array;

public class Demo01 {
    //变量类型  变量名 = 变量值
    /*
    其长度是确定的。数组一旦被创建，它的大小就是不可以改变的。
    其元素必须是相同类型,不允许出现混合类型。
    数组中的元素可以是任何数据类型，包括基本类型和引用类型。
    数组变量属引用类型，数组也可以看成是对象，数组中的每个元素相当于该对象的成员变量。
    数组本身就是对象，Java中对象是在堆中的，因此数组无论保存原始类型还是其他对象类型，
    数组对象本身是在堆中的。
     */


    public static void main(String[] args) {
        int[] nums1;//1.首选的定义方法
        int nums2[];//效果相同，为了方便C语言程序员
        int[] num1 = new int[10]; //2.创建数组，分配大小
        int[] numbers={0,1,2,3,4,5,6,7,8,9,};//3.给数组赋值
        int sum= 0;
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];

        }
        System.out.println(sum);


    }
}
