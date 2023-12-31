package dsaInJava;

import java.util.Arrays;

public class SecondLargestElement {
    // find the second largest element need to return
    //2,13,4,1,3,6,28
    // first appraoch
    // first sort the array and then return arr.length-2
    public static int secondLargestElement (int [] arr){
       // this all scenario we need to test
//        int [] arr = {9,9,9,13};
//        int [] secondArr = {9,9,9,9};
//        int [] thirdArr = {2,3,3,4,37};
        Arrays.sort(arr);
       for(int i = arr.length-1; i>0; i--){
           //here checking till two elements doesn't equal;
           if(arr[i] != arr[i-1]){
               return arr[i-1];
           }
       }
       return Integer.MIN_VALUE;
    }

    // second approach
    public static int secondApproach(int [] arr){
        int max;
        int secMax;
        max=secMax=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>max){
                secMax = max;
                max = x;
            }
            else if(x>secMax && x!=max){
                secMax = x;
            }
        }
        return secMax;
    }
}
