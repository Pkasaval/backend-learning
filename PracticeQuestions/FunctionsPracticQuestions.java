package PracticeQuestions;

public class FunctionsPracticQuestions {
    public static void main(String[] args) {
        System.out.println(avgOfThreeNumbers(3, 4, 8));
        System.out.println(isEven(9));
        isPalindrome(122);
        System.out.println(sumOfTheDigits(721));
    }
    
    public static int avgOfThreeNumbers(int a, int b, int c){
        return (a+b+c)/3;

    }

    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(int num){
        int palindrome = num;
        int reverse = 0;
        while(palindrome!=0){
        int remainder = palindrome%10;
        reverse = reverse * 10 + remainder;//1
        palindrome = palindrome/10;
        }

        if(num==reverse){
            System.out.println(num + " is a palindrome");
            return true;
        }
        return false;

    }

    public static int sumOfTheDigits(int num){
        int sum = 0;
        while(num>0){
        int lastDigit = num%10;
        sum = sum+ lastDigit;
        num= num/10;
        }
        return sum;
    }
}
