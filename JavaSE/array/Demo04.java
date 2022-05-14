package JavaSE.array;

public class Demo04 {
    public static void main(String[] args) {
        //4行2列的二维数组
        int[][] array={{1,2},{2,3},{3,4},{4,5}};
        System.out.println(array[1][0]);
        System.out.println(array[1][1]);
        printArray(array);

    }
    public static void printArray(int[][] arrays){
        //两层for循环打印二维数组
        //arrays.for   增强型for循环
        for (int array[] : arrays) {
            for(int a:array){
                System.out.println(a);
            }
        }
    }
}
