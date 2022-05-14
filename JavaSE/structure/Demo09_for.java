package JavaSE.structure;

public class Demo09_for {
    //练习2： for循环输出0-100之间能被5整除的数，并且每行输出3个
    public static void main(String[] args) {
        for(int i=0;i<=1000;i++){
            if((i!=0)&&(i%5==0)){
                System.out.print(i+"\t");
            }
            //三个被5整除的就换行
            if(i%15==0){
                System.out.println("\n");
            }
            //println输出完会换行
            //print输出完不会换行
        }

    }
}
