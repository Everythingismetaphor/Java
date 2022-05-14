package JavaSE.base;

public class Demo06 {
    //变量作用域
    // 类变量  实例变量  局部变量

    //实例对象，从属于类对象
    //如果不自行初始化，这个类型的默认值为 0 0.0
    //布尔值默认是null；其余的都是null
    String name;
    int age;
    //类对象  static
    static double salary = 2500;



    //main方法
    public static void main(String[] args) {
        //局部变量；必须声明和初始化值
        int i = 10;
        System.out.println(i);

        //变量类型 变量名字 = new Dome6（）；
        Demo06 demo = new Demo06();
        System.out.println(demo.name);
        System.out.println(demo.age);

        System.out.println(salary);


    }
    //其他方法


}
