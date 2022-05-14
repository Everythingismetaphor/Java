package JavaSE.structure;

public class Demo10_for {
    //练习3： for循环输出九九乘法表
    //嵌套for循环
    public static void main(String[] args) {
        for(int j=1;j<=9;j++){
            for(int i=1;i<=j;i++){
                System.out.print(j+"*"+i+"="+(j*i)+"\t");
            }
            System.out.println("\n");
        }

    }
}
