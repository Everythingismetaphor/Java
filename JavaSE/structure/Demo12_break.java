package JavaSE.structure;

public class Demo12_break {
    //break在任何循环的主体部分，用于强制退出循环，不执行循环中剩余的语句
    public static void main(String[] args) {
        int i = 0;
        while(i<100){
            i++;
            System.out.println(i);
            if(i==30){
                break;
            }

        }
        System.out.println("循环结束");
    }
}
