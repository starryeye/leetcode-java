class Solution {
    public int singleNumber(int[] nums) {
        
        Map<Integer, Integer> um = new HashMap<>();
        
        for(int num : nums) {
            
            if(!um.containsKey(num)) {
                um.put(num, 1);
            }else {
                um.remove(num);
            }
        }
        
        // Map.Entry 는 Map 인터페이스가 제공하는 내부 인터페이스로 C++ 의 pair 와 비슷하지만..
        // 범용성은 떨어진다. (Map 에서만 사용됨)
        for(Map.Entry<Integer, Integer> entry : um.entrySet()) {
            return entry.getKey();
        }
        
        return -1;
    }
}