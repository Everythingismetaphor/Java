package OOP.abstract_;
//abstract 抽象类
public abstract class Action
{
    //约束，有人帮我们实现~
    //抽象方法，只有方法名字，没有方法内容
    public abstract void doSomething();
    //1.不能new这个抽象类，只能靠子类去实现它，它就是一个约束？
    //2.抽象类里可以写普通方法，但是有抽象方法必须得是抽象类

    //抽象的抽象：约束

}
