import java.util.LinkedList;
import java.util.Queue;

class FirstNegativeNumber {
  static void firstNegativeNumbers(int[] nums, int k) {
   int i=0;
   int j=0;
   Queue<Integer> negativeQ = new LinkedList<>();
      
   while(j<nums.length) {
      if(nums[j] < 0) {
           negativeQ.add(nums[j]);
      }

      if(j - i + 1 < k) {
        j++;
      } else if(j-i+1 == k) {
        System.out.print(negativeQ.isEmpty() ? "0 " : negativeQ.peek() + " ");
        if(nums[i] < 0) {
           negativeQ.poll();
        }
        i++;
        j++;
      } 
   }

  }
  public static void main(String[] args) {
    System.out.println("First Negative Number");
    int[] nums = new int[] {12, -1, -7, 8, -15, 30, 16, 28};
    firstNegativeNumbers(nums, 3);
  }
}
