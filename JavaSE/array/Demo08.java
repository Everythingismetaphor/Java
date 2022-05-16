package JavaSE.array;

import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        System.out.print("请输入行数：");
        int m = scanner1.nextInt();
        Scanner scanner2=new Scanner(System.in);
        System.out.print("请输入列数：");
        int n = scanner2.nextInt();
        int array[][]=arrayInit(m,n);


        boolean flag=true;
        while(flag){
            //数组赋值
            String s=arraySet();
            //一次读取多个值
            String  ss[]=s.split(",");
            int x = Integer.parseInt(ss[0]);
            int y = Integer.parseInt(ss[1]);
            int z = Integer.parseInt(ss[2]);
            array[x-1][y-1]=z;
            System.out.print("是否继续修改？:(y or n):");
            Scanner scanner3 = new Scanner(System.in);
            String sss= scanner3.next();
            if(sss.equals("n")){
                flag = false;
            }

            arrayShow(array);
        }

        //稀疏数组
        int[][] array2 =  arraySparse(array,m,n);
        arraySparseShow(array2);



    }
    public static int[][] arrayInit(int a, int b){
        //创建数组
        int[][] array=new int[a][b];
        System.out.println("=====原始数组=====");
        arrayShow(array);
        return array;
    }
    public static  void arrayShow(int[][] array){
        //显示数组
        for(int[] ints:array)
        {for (int anInt:ints){
            System.out.print(anInt+"\t");
        }
            System.out.println();
        }

    }
    public static String arraySet(){
        System.out.print("请输入要赋值的行数、列数、值（中间用逗号隔开）：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("=====修改后的数组=====");
        return s;


    }

    public static int[][] arraySparse(int[][] array,int m,int n){
        //稀疏数组表示
        //1.获取有效值的个数
        int sum= 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if (array[i][j]!=0){
                    sum+=1;
                }
            }
        }
        System.out.println("有效值的个数："+sum);
        System.out.println("行\t列\t值");
        //2.创建一个稀疏数组的数组
        int[][] array2 = new int[sum+1][3];

        array2[0][0]=m-1;//减一是因为arraySparseShow里面把每个数都加一了，因为数组是从0开始的
        array2[0][1]=n-1;
        array2[0][2]=sum-1;
        //遍历数组，将非零的值放在稀疏数组
        int count=0;
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                if(array[i][j]!=0){
                    count++;
                    array2[count][0]=i;
                    array2[count][1]=j;
                    array2[count][2]=array[i][j];
                }
            }
        }
                return array2;
    }
    public static  void arraySparseShow(int[][] array){
        //显示稀疏数组
        for(int i =0;i<array.length;i++)
        {for (int j=0;j<array[0].length;j++){
            if(j==2){
                System.out.println(array[i][j]);
            }else

            System.out.print(array[i][j]+1+"\t");
        }
            //System.out.println();
        }

    }


}
