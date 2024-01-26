package Array;

public class Arrays {
     public static int findTheLargest(int numbers[]){
        int largest= Integer.MIN_VALUE;//-infinity
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>largest){
                largest= numbers[i];
            }
        }
        return largest;
     }


    public static void main(String[] args) {
        int numbers[] = {1,12,4,3};
        System.out.println(findTheLargest(numbers));
        
    }
    
}
