package OOP;
//引用传递
public class Demo05 {
    public static void main(String[] args) {


        Person person = new Person();

        System.out.println(person.name);//null


        Demo05.change(person);
        System.out.println(person.name);//Helei
    }
    public static void change(Person person){
        //person是一个对象：
        // 指向的是Person person = new Person()这个具体的人，可以改变属性
    person.name = "HeLei";
    }
}

class Person{

    String name;//null
}
