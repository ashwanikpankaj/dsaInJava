package dsaInJava;

// given an array element need to swap every alternate pair of elements in the arr;
//input =>9,3,6,12,4,32;
//ouptut => 3,9,12,6,32,4
public class SwapEveryPairElement {

    public static boolean isEven(int arrLength){
        return  arrLength%2==0?true:false;
    }
    public static int [] firstApproach(int[] arr){
        int arrLength = isEven(arr.length)?arr.length:arr.length-1;
        int temp;
      for(int i = 0; i<arrLength; i = i+2){
           temp  = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
      }
      return arr;
    }

    public static int [] secondApproach(int [] arr){
        return arr;
    }
}
