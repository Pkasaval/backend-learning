package Array;
import java.util.Arrays;
import java.util.Collections;

public class Sorting {

public static void bubbleSorting(int numbers[]){
    for(int turns = 0; turns<numbers.length-1; turns++){
        for(int j=0; j<numbers.length-1-turns;j++){
            //swap logic
            if(numbers[j]>numbers[j+1]){
                int temp =  numbers[j];
                numbers[j] = numbers[j+1];
                numbers[j+1] = temp;
            }
        }
    }
    for(int i=0; i<numbers.length; i++){
        System.out.print(numbers[i]+ " ");
    }
}

public static void bubbleSortingReduceTimeForSortedArray(int numbers[]){
    for(int turns = 0; turns<numbers.length-1; turns++){
        int swap=0;
        for(int j=0; j<numbers.length-1-turns;j++){
            //swap logic
            if(numbers[j]>numbers[j+1]){
                int temp =  numbers[j];
                numbers[j] = numbers[j+1];
                numbers[j+1] = temp;
                swap++;
            }
        }
        if(swap==0){
            break;
        }
    }
    for(int i=0; i<numbers.length; i++){
        System.out.print(numbers[i]+ " ");
    }
}

public static void selectSort(int numbers[]){
    for(int i=0; i<numbers.length;i++){
        int min = i;
        for(int j=i+1; j<numbers.length;j++){
            if(numbers[min]>numbers[j]){
                min = j;
            }
        }
        int temp = numbers[i];
        numbers[i] = numbers[min];
        numbers[min] = temp;
    }
     for(int i=0; i<numbers.length; i++){
        System.out.print(numbers[i]+ " ");
    }
}

public static void inbuiltSort(int numbers[]){
    Arrays.sort(numbers);
    for(int i=0;i<numbers.length;i++){
        System.out.print(numbers[i] + " ");
    }
    System.out.println();
}

public static void inbuiltSortInReverseOrder(Integer numbers2[]){
    Arrays.sort(numbers2, Collections.reverseOrder());
    for(int i=0;i<numbers2.length;i++){
        System.out.print(numbers2[i] + " ");
    }
    System.out.println();
}

public static void countingSort(int numbers[]){
    //find the range
    int largest = Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++){
       largest = Math.max(largest, numbers[i]);
    }
    //form the count array
    int count[] = new int[largest+1];
    for(int i=0; i<numbers.length;i++){
        count[numbers[i]]++;

    }
    //sort in ascending order
    int j=0;
    for(int i=0; i<count.length;i++){
        while(count[i]>0){
            numbers[j]=i;
            j++;
            count[i]--;
        }
    }
    for(int i=0; i<numbers.length;i++){
        System.out.print(numbers[i]);
    }
}

public static void main(String[] args) {
    int numbers[] = {5,4,1,3,2};
    int numbers1[] = {1,2,3,5,6};
    Integer numbers2[] = {5,4,1,3,2};
    int numbers3[] = {1,2, 8, 2,6,4,9,4,1};
    // bubbleSortingReduceTimeForSortedArray(numbers1);
    // bubbleSorting(numbers);

    // selectSort(numbers);
    // inbuiltSort(numbers);
    // inbuiltSortInReverseOrder(numbers2);
    countingSort(numbers3);
}
    
}
