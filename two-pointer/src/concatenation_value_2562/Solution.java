package concatenation_value_2562;

public class Solution {
    public static  void main(String[] args){
        int[] arr = {5,14,13,8,12};
        int result =  concatenationValue(arr);
        System.out.println(result);
    }

    private static int  concatenationValue(int[] arr){


        int sum = 0;

       int first = 0;
       int last  = arr.length-1;



       while(first < last){

           String concate=Integer.toString(arr[first]).concat(Integer.toString(arr[last]));
           sum += Integer.parseInt(concate);
           first++;
           last--;
       }

        if(first == last){return sum+=arr[first];}

       return sum;

    }
}

