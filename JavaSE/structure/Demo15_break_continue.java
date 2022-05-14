package JavaSE.structure;

public class Demo15_break_continue {
    /*
            编写一个函数windowPosSum(int[] a, int n)，用 a[i] 到 a[i + n] 的和替换每个元素 a[i]，但前提是 a[i] 为正值。
            如果因为到达数组末尾而没有足够的值，我们只求和我们有的值。
        例如，假设我们windowPosSum使用数组a = {1, 2, -3, 4, 5, 4}和调用n = 3。在这种情况下，我们会：
        将 a[0] 替换为 a[0] + a[1] + a[2] + a[3]。
        将 a[1] 替换为 a[1] + a[2] + a[3] + a[4]。
        不要对 a[2] 做任何事情，因为它是负面的。
        将 a[3] 替换为 a[3] + a[4] + a[5]。
        将 a[4] 替换为 a[4] + a[5]。
        不要对 a[5] 做任何事情，因为在 a[5] 之后没有值。
     */
    public static void windowPosSum(int[] a, int n) {
        /** your code here */
        for(int i=0;i<a.length;i++){
            if (a[i]<0) continue;
            for(int j=1;j<=n;j++){
                if(i+j>=a.length)break;
                a[i]+=a[i+j];
            }

        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}
