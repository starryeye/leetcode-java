class Solution {
    public int arraySign(int[] nums) {
        
        int answer = 1;
        
        for(int n : nums) {
            
            if(n == 0)
                return 0;
            else if(n < 0)
                answer *= -1;
            else
                answer *= 1;
        }
        
        return answer;
    }
}