package OOP;

public class Demo03 {
    public static void main(String[] args) {
        System.out.println(add(3,4));
        int add = Demo03.add(2,3);
        System.out.println(add);
    }
    public static int add(int a,int b){
        return a+b;
    }
}
