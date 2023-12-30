class Solution {
    public int maxProduct(int[] nums) {
        int minP = nums[0];
        int maxP = nums[0];
        int max = nums[0];

        for(int i=1; i<nums.length; i++) {
            if(nums[i] < 0) {
              int temp = minP;
              minP = maxP;
              maxP = temp;     
            }
            minP = Math.min(nums[i], nums[i] * minP);
            maxP = Math.max(nums[i], nums[i] * maxP);
            max = Math.max(max, maxP);
        }
        return max;
    }
}
