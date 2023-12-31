package dsaInJava;

import java.util.Arrays;

//given N no of distinctive elements in array
//count all the distinct pair whose sum is equal to target
public class TargetSumArray {

    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        int [] arr1 = {4,6,8,9,14};
        System.out.println(noOfTargetSumArray(arr1,6));
        System.out.println(secondApproach(arr,6));
    }

    public static int noOfTargetSumArray(int [] arr,int target){
        // here time complexity is n2
        int count = 0;
     for(int i = 0; i < arr.length;i++){
         for(int j = i+1; j < arr.length;j++){
             if(arr[i]+arr[j] == target){
                 count++;
             }
         }
     }
     return count;
    }

    public static int secondApproach(int [] arr,int target){
  //by taking two point approach
   // we need to do sorting because to apply the approach of if start+end > target decrease
   // the end or start+end < 0=> increase start
   //if equal then increase start and end both;
   int count = 0;
        int start = 0;
        int end = arr.length-1;
        Arrays.sort(arr);
        //time complexity is nlogn
        while(end>start){
            if(arr[end] + arr[start] == target){
                count++;
                end--;
                start++;
            }
            else if(arr[end] + arr[start] > target){
                end--;
            }
            else if (arr[end] + arr[start] < target){
                start++;
            }
        }
        return count;
    }
}
