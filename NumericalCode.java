package PracticeQuestions;

public class NumericalCode {
    public static void main(String[] args) {
        // System.out.println(factorialOfNumber(5));
        System.out.println(FindBinomialCoefficient(5, 2));
    }

    public static int factorialOfNumber(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    public static int FindBinomialCoefficient(int n, int r){
 int n_fact=factorialOfNumber(n);
int rfact=factorialOfNumber(r);
int m=factorialOfNumber(n-r);
int binaryCoefficient= n_fact/(rfact*m);
 return binaryCoefficient;
    }
}