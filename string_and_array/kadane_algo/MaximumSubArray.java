class Solution {
    public int maxSubArray(int[] nums) {
        int localsum = nums[0];
        int globalsum = nums[0];
        for(int i=1; i<nums.length; i++) {
           localsum = Math.max(nums[i], localsum + nums[i]);
           globalsum = localsum > globalsum ? localsum : globalsum; 
        }
        return globalsum;
    }
}
