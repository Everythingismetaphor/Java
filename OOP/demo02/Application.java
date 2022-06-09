package OOP.demo02;

public class Application {
    public static void main(String[] args) {
        //  new Person 快捷键 alt + enter
        Person person = new Person();
        System.out.println(person.name);
        Person p2 = new Person("小明");
        System.out.println(p2.name);


    }
}
