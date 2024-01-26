package PracticeQuestions;
import java.util.*;

public class PracticeQuestions{
    public static void main(String args []){
       //averageOfNumbers();
      //areaOfSquare();
      calculateTotalCost();
    }

    public static void averageOfNumbers(){
        Scanner sc= new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int N = 3;
        int Avg = (A+B+C)/N ;
        System.out.println(Avg);
    }

    public static void areaOfSquare(){
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("Area of Square is:"+ area);
    }

    public static void calculateTotalCost(){
        // int $ = 10;
        // System.out.println($);
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float cost = pencil+pen+eraser;
        float gst= (cost*18)/100;
        float totalCost = cost+gst;
        System.out.println("Bill:"+ totalCost);
    }
   

}