package dsaInJava;

import java.util.Arrays;
// array contain integer 1 to n-1, and may contain more than one duplicate
// find all the duplicates
// input => {4,3,2,7,5,2,3,1}
public  class DuplicateInArrayPartTwo {
    public static void main(String [] args){
        int [] arr = {4,3,2,7,5,2,3,1};
        int [] arr1 = {1,2,1};
//        duplicateInArray(arr1);
//        optimisedApproach(arr);
        handleZeroApproach();


    }
    public static void duplicateInArray(int [] arr){
        // my approach will be take two pointer i and j
        // and also take current duplicate element;
        int duplicate;
        int i = 0;
        int j = 1;
        int [] result = new int[arr.length];
        // sorting is necessary for this approach to work;
        Arrays.sort(arr);
        while(j<arr.length){
            if(arr[i] == arr[j]){
                duplicate = arr[i];
                j++;
                i++;
                System.out.println(duplicate);
            }
            else if(arr[i] != arr[j]){
                i++;
                j++;
            }

        }
    }

    public static void optimisedApproach(int [] arr){
        for(int i = 0; i < arr.length;i++){
            // calculating x so that we can use this as index in logic/
            // because we are sure 1 to n-1 if exist if taking to manipulate that
            // index element
            // here no sorting done => time complexity O(n)
            int x = Math.abs(arr[i]);
            if(arr[x] > 0){
                arr[x] = -arr[x];
            }
            else{
                System.out.println(x);
            }
        }
    }
    public static void handleZeroApproach(){
        int [] arr = {2,1,0,3,1};
        // approach => use element as index and add element+array size
        // run again loop on that element divide element/arrSize if it is greater
        // than 2 means array ka length 2 baar add hua hai
        // print that element
        for(int i = 0; i < arr.length; i++){
            int x  = arr[i] % arr.length; // to make it come under array index
            arr[x] = arr[x] + arr.length;
        }
        for(int i = 0; i < arr.length;i++){
            //means us index pe pakka 2 bar array ka length add hua hoga
            if(arr[i] /arr.length >=2){
                System.out.println(i);
            }
        }
    }
}