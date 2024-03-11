class Solution {
    public int[] runningSum(int[] nums) {
        
        int[] prefixSum = new int[nums.length];
        
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++) {
            prefixSum[i] = sum + nums[i];
            sum += nums[i];
        }
        
        return prefixSum;
    }
}