package Array;

public class Search {

    public static int linearSearch(String breakfast[], String key){
        for(int i=0; i<breakfast.length;i++){
            if(breakfast[i]==key){
                return i;
            }
        }
        return -1;
    }
//binary Search
    public static int binarySearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
    return -1;
    }

    public static void reverseArray(int numbers[]){
        int start =0;
        int end= numbers.length-1;
        // we can perform the below code with while loop as well
        // while(start<end) {
            //            int temp = numbers[start];
            //            numbers[start] = numbers[end];
            //            numbers[end] = temp;
            //            start++;
            //            end--;
            //        }
        for(int i=start; i<=end;i++){
            int temp= numbers[i];
            numbers[i]=numbers[end];
            numbers[end] = temp;
            end--;
        }
       for(int i=0; i<numbers.length;i++){
        System.out.print(numbers[i]+ " ");
       }
    }

    public static void pairsOfAnArray(int numbers[]){
        int tp=0;
        for(int i=0;i<numbers.length;i++){

            for(int j=i+1;j<numbers.length;j++){
                System.out.print("(" + numbers[i]+ " ,"+ numbers[j] + ")");
                tp++;

            }
            System.out.println();
        
        }
        System.out.println(tp);

    }

    public static void main(String[] args) {

        // String breakfast[] = {"idly", "Dosa", "poori", "buns"};
        // String key = "poori";
        // int index = linearSearch(breakfast, key);
        // if(index== -1){
        //     System.out.println("NOT FOUND");
        // } else{
        //     System.out.println("Key is at Index: "+ index);
        // }


        int numbers[] = {2,4,6,8,10,12,14};
        // System.out.println(binarySearch(numbers,10));

        // reverseArray(numbers);

        pairsOfAnArray(numbers);
    }
    
}
