package OOP.demo02;
/*
空的Person类默认加了一个没有返回值的方法(构造器)，与类名同名
public Person(){
}
 */

public class Person {
    //一个类即使什么都不写，也会存在一个方法
    //默认无参构造
    String name;   //null
    //实例化初始值
    //1.使用new 关键字，本质在调用构造器。（必须要有构造器）
    //2.用来初始化值
    public Person(){
    this.name="Helei";   //Helei
    }


    //有参构造：一旦定义了有参构造，无参构造必须显式定义（本来是默认的有个无参构造的可以调用）
    public Person(String name){
        this.name = name; //两个name不一样

        //alt + insert  生成构造器
    }


}
/*
    public static void main(String[] args) {
        //  new Person 快捷键 alt + enter
        Person person = new Person();
        System.out.println(person.name);
        Person p2 = new Person("小明");
        System.out.println(p2.name);

        构造器：
            1.和类名相同
            2.没有返回值
        作用：
            1.new本质在调用构造器
            2.初始化对象的值
            3.定义了有参构造后，如果想使用无参构造，必须要显式的定义一个无参构造

 */


