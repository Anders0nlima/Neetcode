package ArraysHashing;

import java.util.Arrays;
import java.util.HashMap;

public class Wteste {
   public int[] Wteste(int[] nums, int target){
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i = 0; i < nums.length; i++){
           int complement = target - nums[i];
           if(map.containsKey(complement)){
               return new int[]{map.get(complement), i};
           }
           map.put(nums[i], i);
       }
       return  new int[0];
   }

    public static void main(String[] args) {
        Wteste wteste = new Wteste();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 15;
        int[] result = wteste.Wteste(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
