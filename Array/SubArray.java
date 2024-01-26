package Array;

public class SubArray {
    public static void main(String[] args) {
        
        int numbers[] = {2,4,6,8,10};
        int numbers1[]= {-1, 4, -6, -8, 9};
        // getSubArrayBruteForce(numbers);
        // findTheMaxSumOfSubArray(numbers);
        // usingPrefixSumfindTheMaxSumOfSubArray(numbers);
        // kadanesfindTheMaxSumOfSubArray(numbers);
        kadanes(numbers1);
    }

public static void getSubArrayBruteForce(int numbers[]){
    for(int i=0; i<numbers.length; i++){

        for(int j=i; j<numbers.length;j++){

            for(int k=i; k<=j;k++){
                System.out.print(numbers[k] + " ");
            }
            System.out.println();
        }
    }
}

//via brute force--> time complexity is high i.e n^3
public static void findTheMaxSumOfSubArray(int numbers[]){
int maxSum = Integer.MIN_VALUE;
int currSum = 0;
     for(int i=0; i<numbers.length; i++){
        for(int j=i; j<numbers.length;j++){

            currSum =0;
            for(int k=i; k<=j;k++){
              currSum = currSum + numbers[k];
            }
            System.out.println(currSum);

            if(currSum > maxSum){
                maxSum = currSum;
            } 
        }
    }
    System.out.println("Max sum is "+ maxSum);
}

//solving max subarray sum using prefix sum
public static void usingPrefixSumfindTheMaxSumOfSubArray(int numbers[]){

    int maxSum = Integer.MIN_VALUE;
    //form the prefix array
    int prefix[] = new int[numbers.length];
    prefix[0]  = numbers[0];
    for(int i=1 ; i<numbers.length; i++){
        prefix[i] = prefix[i-1] + numbers[i];
    }

    //finding the sum
    for(int i=0; i<numbers.length; i++){
        int start = i;
        for(int j=i; j<numbers.length; j++){
            int end = j;
            int currSum = start==0? prefix[end]:prefix[end] - prefix[start-1];

            if(maxSum<currSum){
                maxSum = currSum;
            }
            System.out.println(currSum);
        }
    }

    System.out.println("Max sum is "+ maxSum);
}

public static void kadanesfindTheMaxSumOfSubArray(int numbers[]){
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;

    for(int i=0; i<numbers.length;i++){
        currSum = currSum + numbers[i];

        if(currSum<0){
            currSum =0;
        }
        maxSum = Math.max(maxSum, currSum);
    }

    System.out.println(maxSum + " is the max sum");

}

public static void kadanes(int numbers[]){
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int negativeSum = 0;
    int minSum=Integer.MIN_VALUE;

    for(int i=0; i<numbers.length;i++){
        if(numbers[i]<0){
            // negativeSum = negativeSum + numbers[i];//-7
            minSum = Math.max(numbers[i], minSum);//-7
        }
        else{
            currSum = currSum + numbers[i];//13
            maxSum = Math.max(maxSum, currSum);//4
        }
    }
     System.out.println(minSum);
     System.out.println(maxSum);

}
    
}
