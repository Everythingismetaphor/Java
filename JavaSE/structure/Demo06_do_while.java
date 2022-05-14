package JavaSE.structure;

public class Demo06_do_while {
    public static void main(String[] args) {
        int a = 0;
        while(a<0){
            System.out.println(a);
            a++;
        }
        System.out.println("===========================");
        do{
            System.out.println(a);
            a++;
        }while (a<0);
    }
}
