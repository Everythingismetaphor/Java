package JavaSE.array;

public class Demo03 {
    public static void main(String[] args) {
        int[] arrays = {1, 12, 5, 7, 9};
       printArray(arrays);


        int max = arrays[0];
        for (int i = 1; i < arrays.length; i++) {
            max = max < arrays[i] ? arrays[i] : max;
        }
        System.out.println("max"+max);
        int[] reverse = reverse(arrays);
        printArray(reverse);
    }
    //打印数组
    public static void printArray(int[] arrays){
        //arrays.for   增强型for循环
        for (int array : arrays) {
            System.out.println(array);

        }
    }
    //反转数组
    public static int[] reverse(int[] arrays){
        int[] result=new int[arrays.length];

        //反转的操作
        for(int i=0,j=result.length-1;i<arrays.length;i++,j--){
            result[j]=arrays[i];

        }
        return result;
    }

}