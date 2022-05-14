package JavaSE.structure;

public class Demo05_do_while {
    //do while循环和while循环相似，不同的是，do...while循环至少会执行一次
    //while是先判断再执行，而do..while是先执行再判断
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        do{
            sum = sum+i;
            i++;

        }while (i<=100);

        System.out.println(sum);
    }
}
