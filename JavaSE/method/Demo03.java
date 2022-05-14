package JavaSE.method;

public class Demo03 {
    /*
    方法的重载的规则：
        方法名必须相同。
        参数列表必须不同。（个数不同、或类型不同、参数排列顺序不同）
        方法的返回类型可以相同也可以不同。
        仅仅返回类型不同不足以成为方法的重载。
     */
    //实现理论：方法名相同时，编译器UI根据调用方法的参数个数，参数类型等去逐个匹配
    //以选择对应的方法，如果配皮失败，则编译器报错。
    public static void main(String[] args) {
        int x = add(10,20);
        int y = add(10,20,30);
        System.out.println(x);
        System.out.println(y);


    }
    public static int add(int a ,int b){
        return a+b;
    }
    public static int add(int a ,int b,int c){
        return a+b+c;
    }
}
