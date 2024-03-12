class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        
        Map<Integer, Integer> count = new HashMap<>();
        
        for(int a : arr) {
            
            if(count.containsKey(a)) {
                int val = count.get(a);
                count.put(a, ++val);
            }else {
                count.put(a, 1);
            }
        }
        
        Set<Integer> duplication = new HashSet<>();
        
        for(Integer key : count.keySet()) {
            if(duplication.add(count.get(key)) == false) {
                return false;
            }
        }
            
        return true;
    }
}