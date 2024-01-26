package PracticeQuestions;

public class Pattrens {
    public static void main(String[] args) {
        //characterPyramid();
        //invertedRotatedHalfPyramid();
        // invertedRotatedHalfPyramid(5);
        // invertedHalfPyramid(5);
        // floydsTriangle(5);
        // zeroOneTriangle(5);
        // butterflyPattern(3);
        // solidRhombus(5);
        hollowRhombus(5);
        diamondPattern(5);
    
    }

    // private static void invertedRotatedHalfPyramid() {
    //     int n=4;
    //     for(int i=1;i<=n;i++){
    //         for(int j=n;j<=i;j--){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // private static void characterPyramid() {
    //     int n=4;
    //     char ch='A';
    //     for(int i=1;i<=n;i++){
    //         for(int j=1; j<=i;j++){
    //             System.out.print(ch);
    //             ch++;
    //         }
    //         System.out.println();
    //     }
    // }

    public static void invertedRotatedHalfPyramid(int n){
        for(int i=1; i<=n; i++){
            //for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for stars
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        System.out.println();
        }
    }

    public static void floydsTriangle(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k);
                k++;//2
            }
        System.out.println();
        }
    }

    public static void zeroOneTriangle(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k%2);
                k++;//2
            }
        System.out.println();
        }

         //  for(int i=1;i<=n;i++){
            // for(int j=1;j<=i;j++){
            //     if((i+j)%2==0){
            //         System.out.print(1);
            //     }
            //     else{
            //         System.out.print(0);
            //     }
            // }

    }

    public static void butterflyPattern(int n){
        //for 1st half
        for(int i=1; i<=n; i++){
            //for stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //for spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for(int i=n; i>=1; i--){
            //for stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //for spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int n){

         for(int i=1; i<=n; i++){
            //for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int n){

        for(int i=1;i<=n;i++){

            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //stars --> boundary rectangle
             for(int j=1; j<=n; j++){
                if(i==1|| i==n || j==1|| j==n){
                System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void diamondPattern(int n){
        //for 1st half
        for(int i=1; i<=n; i++){
            //for stars
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for(int i=n; i>=1; i--){
            //for stars
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    

}
