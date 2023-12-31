package dsaInJava;

import java.util.Arrays;

// given an array of size N and it contains element upto N-2;
// there is single integer that is present twice find that element;
//input => 0,1,2,3,1
//output => 1
public class DuplicateInArray {
    public static void main(String[] args){
        System.out.println("Hello world !!");
        int [] arr = {0,1,2,3,1};
        duplicateInArray(arr);
    }
    //first approach run two loop i and j = i , find the if any repeats twice break the loop and
    // and return that number
    //read it

    // second approach
    public  static void duplicateInArray(int [] arr){
       Arrays.sort(arr);
       // sorting is necessary after that we can detect if two element is same
       int i = 0;
       int length1 = arr.length-1;
       while( i<length1){
           if(arr[i] == arr[i+1]){
               System.out.println(arr[i]);
               break;
           }
           i++;
       }

    }

//    public static void optimizedDuplicateInArray(int [] arr){
//
//    }
}
