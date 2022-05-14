package JavaSE.structure;

public class Demo14_test {

    public static void drawTriangle(int a){
        //外循环，循环5次
        for (int i = 1; i <=a; i++) {
            for(int j = a;j>=i;j--){
                System.out.print(' ');
            }
            for(int j = 1;j<=i;j++){
                System.out.print('*');
            }
            for(int j = 1;j<i;j++){
                System.out.print('*');
            }
            System.out.println();

        }

    }
    //练习题 打印三角形
    public static void main(String[] args) {
        drawTriangle(10);

    }
}
