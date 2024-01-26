package PracticeQuestions;

public class NumberConversion {
    public static void main(String[] args) {
        System.out.println(binaryToDecimalConversion(1011));
        System.out.println(decimalToBinaryConversion(9));
        
    }

    public static int binaryToDecimalConversion(int binNum){
        int pow =0;
        int dec=0;
        while(binNum > 0){
          int lastDigit = binNum%10;
          dec = dec+ (lastDigit * (int) Math.pow(2, pow));
          binNum = binNum/10;
          pow++;
        }
        return dec;
    }

    public static int decimalToBinaryConversion(int decNum){
        int binNum=0;
        int pow = 0;

        while(decNum>0){
           int reminder = decNum%2;
           binNum = binNum + (reminder * (int) Math.pow(10, pow));
           decNum = decNum/2;
           pow++;
        }
        return binNum;
    }
}

