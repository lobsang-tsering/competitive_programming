import java.util.*;

public class UniSum {
  static int uniSum(ArrayList<Integer> nums) {
    HashMap<Integer, Integer> m = new HashMap<>();
    int sum = 0;
    for(int i=0; i<nums.size(); i++) {
      if(m.containsKey(nums.get(i))){
        sum -= nums.get(i);
      } else {
        m.put(nums.get(i), i);
        sum += nums.get(i);
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,2,7,7,6));
    int sum = uniSum(nums);
    System.out.println(sum);
  }
}
