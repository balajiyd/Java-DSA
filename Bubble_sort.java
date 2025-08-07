import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.swap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,1,7,4,9,10,44};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));




    }
public static void BubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>=arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
}
   

}

