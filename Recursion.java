package recursion;

import java.lang.reflect.Array;

public class Recursion {
    public static void main(String[] args) {
        int n = 4;
        int i = 0;
        int arr[] = {1,2,3,5,6,5};
        int base = 2;
        int power = 4;
        // printDec(n);
        // printInc(n);
        // System.out.println(sumOfNumbers(n));
    //    System.out.println(factOfNumber(n));
    //    System.out.println(fib(n));
    //    System.out.println(isSorted(arr, i));
    // findFirstOcc(arr, i, n);
    // System.out.println(lastOcc(arr, i, n));
//    System.out.println(power(base, power));
// System.out.println(tiling(n));

removeDuplicate("appnnacollege",0,new StringBuilder(""), new boolean[26]);
        
    }

    public static void printDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        printInc(n-1);
        System.out.println(n + " ");
    }

    public static int sumOfNumbers(int n){
          if( n==1){
            return 1;
          }
        int sum = sumOfNumbers(n-1);
       return(n+sum);
    }
    
    public static int factOfNumber(int n){
        if(n==0){
            return 1;
        }
      int factnMinusOne = factOfNumber(n-1);
     return n * factnMinusOne;
    }

    public static int fib(int n){
        if(n==1 || n==0){
            return n;
        }
       int fNM1 = fib(n-1);
       int fNM2 = fib(n-2);
       int fN = fNM1 + fNM2 ;
       return fN;
    }

    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }

       if( arr[i]< arr[i+1]){
        return isSorted(arr, i+1);
       }
       return false;
    }

    public static int findFirstOcc(int arr[], int i, int n){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==n){
            return i;
        }
        return findFirstOcc(arr, i+1, n);
    }

    public static int lastOcc(int arr[], int i, int n){
        if(i==arr.length){
            return -1;
        }
        int found = lastOcc(arr, i+1, n);
    
        if(found ==-1 && arr[i]==n){
            return i;
        }
        return found;

    }

    public static int findThePower(int base, int power){
        if(power == 0){
            return 1;
        }
      int prevPower =  findThePower(base, power-1);
     return base*prevPower;
    }

    public static int power(int base, int power){ //optimised
        if(power == 0){
            return 1;
        }
        int halfPower = power(base, power/2);
        int finalAns = halfPower * halfPower;
        if(power%2 != 0){
            finalAns = base * finalAns;
        }
        return finalAns;
    }

    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }
        //kaam
        //horizontal
        int horizon = tiling(n-1);
        //vertical
        int vertical = tiling(n-2);
        return horizon + vertical;
    }

    public static void removeDuplicate(String str, int indx, StringBuilder newString, boolean tracker[]){//parvati, 0
        if(indx==str.length()){
        System.out.println(newString);
        return;
        }

        //kaam
        char currChar = str.charAt(indx);
        if(tracker[currChar-'a']==true){
            //duplicate
            removeDuplicate(str, indx+1,newString, tracker);

        }else{
            tracker[currChar-'a'] = true;
            removeDuplicate(str, indx+1,newString.append(currChar),tracker);
        }
        
    }

    
    
}
