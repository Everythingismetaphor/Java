package OOP.interface_;
//抽象的思维
//接口不能被实例化，没有构造方法
//可以实现多个接口
public interface UserService {

    //接口中的所有定义的属性都是常量 public static final
    public static final int AGE = 99;


    //接口中的所有定义的方法都是抽象的public static
    public abstract   void run(String name);
    void delete(String name);
    void update(String name);
    void query(String name);

}
