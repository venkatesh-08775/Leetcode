package move_zeros_283;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int[] result = moveZero(arr);
        System.out.println(Arrays.toString(result));
    }
    private static  int[] moveZero(int[] nums){

        int index = 0;
    for(int i = 0; i < nums.length;i++){
       if(nums[i] != 0){
           nums[index] = nums[i];
           index++;
       }
    }

    for(int i = index; i< nums.length;i++){
        nums[i] =0;
    }

    return nums;
    }
}
