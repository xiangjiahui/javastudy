public class PrintTriangle {
    public static void main(String[] args) {
            for(int i=1;i<=5;i++){  //等腰
                for(int j=0;j<5-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=2*i-1;k++){
                    System.out.print("*");
                }
                System.out.println();//println意为换行
            }
        System.out.println("————————————————————————————");
            for(int i=1;i<=5;i++){  //直角
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                //System.out.print("\n");
                System.out.println();
            }
        System.out.println("————————————————————————————");
            for(int i=1;i<=5;i++){  //倒直角
                for(int j=5;j>=i;j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        System.out.println("————————————————————————————");
            for(int i=1;i<=5;i++){   //右直角
                for(int j=5;j>i;j--){   //可k>=i-1
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        System.out.println("————————————————————————————");
            for(int i=1;i<=5;i++){  //倒右直角
                for(int k=1;k<=i;k++){  //可k<=i-1
                    System.out.print(" ");
                }
                for(int j=5;j>=i;j--){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
