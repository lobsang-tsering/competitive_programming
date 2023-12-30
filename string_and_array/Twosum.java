import java.util.*;

class Twosum {
    public static List<Integer> findTwoSum(List<Integer> nums, int target) {
    HashMap<Integer, Integer> lookUp = new HashMap<>();
    
    for(int i=0; i<nums.size(); i++){
       int diff = target - nums.get(i);
        
       if(lookUp.containsKey(diff)) {
           return new ArrayList<Integer>(Arrays.asList(i, lookUp.get(diff)));
        }
       
        lookUp.put(nums.get(i), i);
    }
   return new ArrayList<Integer>();    
   }
}
 
