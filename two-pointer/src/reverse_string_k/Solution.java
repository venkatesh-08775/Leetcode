package reverse_string_k;

public class Solution {
    public static void main(String[] args) {
        String str = "abcd";
        int k = 2;
        String result = reverseString(str,k);
        System.out.println(result);
    }

    private static String reverseString(String s, int k){
        if(k < 0){
            return s;
        }
        int start = 0;
        int end = k-1;
        char[] arr = s.toCharArray();
        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return new String(arr);
    }
}
