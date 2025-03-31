package reverse_prefix_2000;

public class Solution {
    public static void main(String[] args) {
        String str = "abcdefd";
        char ch = 'd';
         String result = reversePrefix(str,ch);
         System.out.println(result);
    }

    private static String reversePrefix(String s,char c){
        int n = s.indexOf(c);
      if(n == -1){
          return s;
      }

      int start = 0;
      int end = n;
      char[] arr = s.toCharArray();

      while (start < end){
          char temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
          start++;
          end--;
      }

      return new String(arr);
    }
}
