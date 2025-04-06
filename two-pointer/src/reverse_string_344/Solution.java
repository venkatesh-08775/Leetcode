package reverse_string_344;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a','h'};
        char[] result = reverseString(s);
        System.out.println(Arrays.toString(result));
    }

    private static char[] reverseString(char[] s){
        int start = 0;
        int end = s.length-1;


        while (start < end){
            char temp  = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }

        return  s;
    }
}
