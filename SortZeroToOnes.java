
//given array that contains 0s and 1s
// sort like 0's comes first and then 1 comes
//input = [1,0,0,1] ,ouput = [0,0,1,1]
// first approach directly apply Arrays.sort(arr) => time complexity nlogn

import java.util.Arrays;

public class SortZeroToOnes {
    public static void main(String [] args){
        int [] arr = {0,1,1,0,0,1};
        System.out.println(Arrays.toString(sortZeroAndOnes(arr)));

    }

    public static int [] sortZeroAndOnes(int [] arr){
        int left =  0;
        int right = arr.length-1;
        int temp;
        while(right>left){
            if(arr[left] == 1){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                right--;
            }
            else{
                // important point to consider that if at left index increase only when
                // when the element is zero
                // test/
                left++;
            }

        }
        return arr;
    }
}
