
package PracticeQuestions;

import java.util.Scanner;

public class ConditionalStatements{
    public static void main(String[] args) {
        // positiveOrNegative();
        // feverCheck();
        // weekName();
        leapyear();
    }

public static void positiveOrNegative(){
    Scanner sc= new Scanner(System.in);
    int number=sc.nextInt();
    if(number>=0){
        System.out.println(number + " is a Positive number");
    }
    else{
        System.out.println(number + " is a negative number");
    }
}

public static void feverCheck(){
    double temp=103.5;
    if(temp>100){
        System.out.println("You have fever");
    }
    else{
        System.out.println("you don't have fever");
    }
}

public static void weekName(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number between 1 and 7");
    int weekNumber=sc.nextInt();
    switch(weekNumber){
        case 1: System.out.println("Sunday");
        break;
        case 2: System.out.println("Monday");
        break;
        case 3: System.out.println("Tuesday");
        break;
        case 4: System.out.println("Wednesday");
        break;
        case 5: System.out.println("Thursday");
        break;
        case 6: System.out.println("Friday");
        break;
        case 7: System.out.println("Saturday");
        break;
        default: System.out.println("Invalid entry");
    }
}

public static void leapyear(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the year");
    int year=sc.nextInt();
    boolean x= (year%4==0);
    boolean y= (year%100!=0);
    boolean z= (year%100==0 && year%400==0);
    if(x && (y || z)){
        System.out.println("Leap year");
    }
    else{
        System.out.println("Not a leap year");
    }
    
}

}
