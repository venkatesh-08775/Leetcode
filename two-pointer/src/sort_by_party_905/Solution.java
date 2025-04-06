package sort_by_party_905;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
         int[] arr = {3,1,2,4};
         int[] result  = sortArray(arr);
         System.out.println(Arrays.toString(result));
    }
    private static  int[] sortArray(int[] nums){
        if(nums.length == 0){return nums;}

        int start = 0;
        int end   = nums.length-1;

        while (start < end) {
            if(nums[start] % 2 != 0 && nums[end] % 2==0){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
            if(nums[start] % 2 ==0){start++;}
            if(nums[end] %2 != 0){end--;}

        }

        return nums;

    }
}
