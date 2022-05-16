package OOP.demo01;

public class Application {
    //类 抽象的，实例化
    //类实例化后会返回一个自己的对象！
    //student 对象就是Student类的具体实例

    public static void main(String[] args) {
        Student hh = new Student();
        Student mm = new Student();


        hh.name="红红";
        hh.age=3;
        mm.name="明明";
        mm.age=3;

        System.out.println(hh.name);
        System.out.println(hh.age);


        System.out.println(mm.name);
        System.out.println(mm.age);

       hh.study();


    }


}
