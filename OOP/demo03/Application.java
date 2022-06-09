package OOP.demo03;

public class Application {

    public static void main(String[] args) {
        Pet dog = new Pet();

        dog.name="旺财";
        dog.age=3;
        dog.shout("汪~");

        System.out.println(dog.name);
        System.out.println(dog.age);

        Pet cat = new Pet();
        cat.name="咪咪";
        cat.age=2;
        System.out.println(cat.name);
        System.out.println(cat.age);
        cat.shout("喵~");



    }
}
