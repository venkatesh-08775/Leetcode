package word_occurs_prefix_1455;

public class Solution {
    public static void main(String[] args) {
        String sentence ="this problem is an easy";
        String searchWord = "pro";

        int result = findIndex(sentence,searchWord);
        System.out.println(result);

    }

    private static int findIndex(String sentence, String searchWord){
        String[] words = sentence.split(" ");

        for(int i = 0; i < words.length;i++){
            if( words[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}
