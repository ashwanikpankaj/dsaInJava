import java.util.Arrays;

public class Array {
    public void array(){
        //(i)ways to declare the array
        int [] months = new int[12];

        //(ii) here we have to keep the size of [] empty
        int [] newMonths = new int[]{1,2,2,2,3};

        //(iii) ways
        int [] arr = {1,2,3,5,6};

        //(iv) here we have to
        int [] fourthMonths;
      //   fourthMonths  = {1,2,2,3} //ERROR
        fourthMonths = new int[]{1,2,33};

        // How to get the size of the array
       int [] sizeArr = {1,3,35,3};
       int x =  sizeArr.length;
     //  sizeArr.length = 10; error
        // to increase the size of the array
        sizeArr = new int[] {1,3,4,4,5,4};

    }
}
