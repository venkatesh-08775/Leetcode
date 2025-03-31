package remove_duplicate_26;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {10,10,20,20,30,40,40,50,70};
        int result = removeDuplicates(arr);
        System.out.println(result);

    }

    public static int removeDuplicates(int[] arr){
        if(arr.length == 0){return  0;}

        int unique = 0;

        for(int i = 1; i < arr.length;i++){
            if(arr[i] != arr[unique]){
                unique++;
                arr[unique] = arr[i] ;
            }
        }
        System.out.println(Arrays.toString(arr));
          return unique+1;
    }
}
