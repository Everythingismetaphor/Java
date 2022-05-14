package JavaSE.structure;

public class Demo08_for {
    //练习1: 计算0-100之间的奇数和，偶数和
    public static void main(String[] args) {
        int oddSum=0;
        int evenSum=0;
        for(int i =0;i<=100;i++){
            //如果i是奇数
            if(i%2!=0){
                oddSum+=i;
            }else {
                evenSum+=i;
            }
        }
        System.out.println("奇数的和："+oddSum);
        System.out.println("偶数的和："+evenSum);

    }
}
