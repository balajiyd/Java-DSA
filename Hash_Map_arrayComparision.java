import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import static java.util.Collections.min;
import static java.util.Collections.swap;

public class Main {
    public static void main(String[] args) {
      int[] arr1 = {1,2,33};
      int[] arr2 = {3,6,1};

        System.out.println(itemsCommon(arr1,arr2));





    }
    public static boolean itemsCommon(int[] arr1, int[] arr2){
        HashMap<Integer,Boolean> myHash = new HashMap<>();

        for(int i: arr1){
            myHash.put(i, true);

        }
        for(int j:arr2){
            if(myHash.get(j) != null){return true;}
        }
        return false;
    }


}

