package JavaSE.array;

public class Demo07 {
    //稀疏数组应用
    public static void main(String[] args) {
        //1.创建一个二维数组 11*11 0：没有棋子， 1：黑棋  2：白棋
        int[][] array1= new int[11][11];


            array1[1][2] = 1;
            array1[2][3] = 2;
            //输出原始的数组
            System.out.println("输出原始的数组");

            for(int[] ints:array1)
            {for (int anInt:ints){
                System.out.print(anInt+"\t");
            }
                System.out.println();
            }




        System.out.println("===============================");
        System.out.println("记录稀疏数组");




        }

    }


