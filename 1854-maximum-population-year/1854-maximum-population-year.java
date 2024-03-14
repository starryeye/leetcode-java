class Solution {
    public int maximumPopulation(int[][] logs) {
        
        Map<Integer, Integer> treeMap = new TreeMap<>();
        
        for(int i = 0; i < logs.length; i++) {
            
            treeMap.put(logs[i][0], treeMap.getOrDefault(logs[i][0], 0) + 1);
            treeMap.put(logs[i][1], treeMap.getOrDefault(logs[i][1], 0) - 1);
        }
        
        Integer answer = Integer.MAX_VALUE;
        Integer maxPopulation = 0;
        Integer currentPopulation = 0;
        
        for(Integer key : treeMap.keySet()) {
            
            currentPopulation += treeMap.get(key);
            
            if(currentPopulation > maxPopulation) {
                answer = key;
                maxPopulation = currentPopulation;
            }
        }
        
        return answer;
    }
}