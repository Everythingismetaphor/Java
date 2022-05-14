package JavaSE.structure;

public class Demo13_continue {
    //continue语句用在循环语句体中，用于终止某次循环过程，即跳出循环体中尚未执行的语句
    //接着进行下一次是否执行循环的判断
    //goto标签
    public static void main(String[] args) {
        int j = 0;
        while(j<100){
            j++;

            if((j%5)==0){
                System.out.println(j+"是5的倍数");
                continue; //跳过下面的语句，回到循环开始
            }
            System.out.println(j+"不是5的倍数");
        }


    }
    }

