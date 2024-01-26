package PracticeQuestions;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(8));
        primesInRange(10);

    }
    
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
            return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n){
        for(int i=2;i<=n;i++){
          if(isPrime(i)){
            System.out.print(i + " ");
          }
        }

    }

    public static int binaryToDecimalConversion(int binNum){
        int pow =0;
        int dec=0;
        int myNum= binNum;

        while(binNum > 0){
          int lastDigit = binNum%10;
          dec = dec+ (lastDigit * (int) Math.pow(2, pow));
          binNum = binNum/10;
          pow++;
        }
        return dec;
    }
}
