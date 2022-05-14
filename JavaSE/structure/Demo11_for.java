package JavaSE.structure;

public class Demo11_for {
    //增强for循环     for（声明语句：表达式）
    //主要用于数组或集合的增强型for循环
    /*
    Java 还支持使用“增强的 for 循环”对数组进行迭代。
    基本思想是在很多情况下我们实际上根本不关心索引。
    在这种情况下，我们避免使用涉及冒号的特殊语法创建索引变量。
     */
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50};

        //遍历数组的元素
        for(int x:numbers){
            System.out.println(x);
        }
    }
}
