package OOP.demo04;
//数据封装
/*
    1.提高程序的安全性，保护数据
    2.隐藏代码的实现细节
    3.统一接口.
    4.增加系统可维护性
 */
public class Student {
    //私有属性
    private String name;
    private int id;
    private char sex;

    //提供一个可以操作这个属性的方法！
    //提供一些public 的 get、set方法

    //get  获得这个数据

    public String getname(){
        return this.name;
    }
    //set  给这个数据设置值
    public void setName(String name){
        this.name=name;
    }

}
