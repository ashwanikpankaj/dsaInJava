package dsaInJava;

import java.util.Arrays;

public class SortZeroOnesAndTwos {
    public static void main(String [] args){
        System.out.println("Hello world");
        int [] arr = {0,1,2,1,0,2,0,1};
        System.out.println(Arrays.toString(sortZerosOnesAndTwos(arr)));
        System.out.println(Arrays.toString(secondApproach(arr)));
    }
    public static int [] sortZerosOnesAndTwos(int [] arr){
         int temp;
         int temp1;
         int i = 0;
         int j = arr.length-1;
         int k = arr.length-1;
         while(j>i){
             // if last element is 2 just decrement j and k no need to swap
             if(arr[k] ==2){
                 j--;
                 k--;
             }
             else if(arr[i] == 1 && arr[k] !=2){
                 //arr[k] is not equal to 2 just keep the k pointer there in case
                 // i has two comes then will swap with that
                  temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
                 j--;
             }
             else if(arr[i] == 2){
                 temp = arr[i];
                 arr[i] = arr[k];
                 arr[k] = temp;
                 k--;
             }
             else{
                 i++;
             }
         }
         return arr;


    }
    public static int [] secondApproach(int [] arr){
        // take the 3 indexes
        // first => left = 0, right => length-1, current;
        //current pe 0 mile to left k saath swap karo aur 2 mile to right pe swap karo
        //agar 1 mile to kuch nahi karna hai;
        int left = 0;
        int right = arr.length-1;
        int current = 0;
        int temp;
        while(current<=right){
            if(arr[current] == 0){
                temp  = arr[left];
                arr[left] = arr[current];
                arr[current] =  temp;
                left++;
                current++;
            }
            else if(arr[current] == 2){
                temp  = arr[right];
                arr[left] = arr[current];
                arr[current] =  temp;
                right--;
               // current++; nahi hoga ho sakta hai swap pe 0 aaye right se
                // wait for the second iteration to handle
            }
            else{
                current++;
            }
        }
    return arr;
    }
}
