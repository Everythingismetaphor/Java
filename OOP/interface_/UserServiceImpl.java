package OOP.interface_;
//抽象类： extends
//类 可以实现接口 implements 接口
//实现了接口的类，必须要重写接口中的方法
//利用接口实现多继承
//interface定义  implement使用，再重写方法

public class UserServiceImpl implements UserService,TimeService{
//点  UserServiceImpl  alt + enter

    @Override
    public void run(String name) {

    }

    @Override
    public void delete(String name) {

    }

    @Override
    public void update(String name) {

    }

    @Override
    public void query(String name) {

    }

    @Override
    public void time() {

    }
}
