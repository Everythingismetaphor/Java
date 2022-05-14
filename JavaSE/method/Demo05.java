package JavaSE.method;

public class Demo05 {
    //可变参数
    //在方法声明中，在指定参数类型后加一个省略号（...）
    //一个方法中只能指定一个可变参数，它必须是方法的最后一个参数。任何普通的参数必须在它之前声明
    public static void main(String[] args) {
        printMax(10,20,40,25,12,17);
        printMax(new double[]{3,4,5});

    }
    public static void printMax(double... numbers){
        if (numbers.length == 0){
            System.out.println("No argument passed");
            return;
        }
        double result = numbers[0];
        //排序
        for (int i=1;i< numbers.length;i++){
            if (numbers[i]>result){
                result = numbers[i];
            }
        }
        System.out.println("The max value is:"+result);
    }
}
