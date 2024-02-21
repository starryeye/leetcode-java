class Solution {
    public int[] sumZero(int n) {
        
        
        int[] answer = new int[n]; // default element 0 이라 n 이 홀수인 경우 생각 안해줘도 됨
        
        int l = 0;
        int r = n - 1;
        
        int value = 1;
        
        while(l < r) {
            
            answer[l++] = value;
            answer[r--] = -value;
            value++;
        }
        
        return answer;
    }
}