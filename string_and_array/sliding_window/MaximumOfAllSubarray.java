import java.util.ArrayDeque;
import java.util.Deque;
import java.util.ArrayList;

class MaximumOfAllSubarray {

  static ArrayList<Integer>  maximumOfAllSubarrays(int[] nums, int k) {
    int i = 0;
    int j = 0;
    
    ArrayList<Integer> ans = new ArrayList<>();
    Deque<Integer> dq = new ArrayDeque<>();

    while(j < nums.length) {
        
        while(dq.size() > 0 && dq.getLast() < nums[j]) {
           dq.removeLast();
        }
        
        dq.addLast(nums[j]);
  
        if(j-i+1 < k) {
          j++;
        }

        if(j-i+1 == k) {
         int peek = dq.getFirst();
         ans.add(peek);
	 if(nums[i] == peek) {
            dq.removeFirst();
         }
         i++; j++;
	}
    }
   return ans;
  }
 
  public static void main(String[] args) {
    System.out.println("Maximum of all subarray");
    int[] nums = new int[] {1,3,-1, -3,5,3,6,7};
    int k = 3;
    System.out.println(maximumOfAllSubarrays(nums, k));
  }
}
