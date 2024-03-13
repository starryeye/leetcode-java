class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        
        Integer word1Index = -1;
        Integer word2Index = -1;
        Integer minDist = Integer.MAX_VALUE;
        
        for(int i = 0; i < wordsDict.length; i++) {
            
            if(wordsDict[i].equals(word1)) {
                word1Index = i;
                if(word2Index != -1) {
                    minDist = Math.min(minDist, word1Index - word2Index);
                }
            }
            
            if(wordsDict[i].equals(word2)) {
                word2Index = i;
                if(word1Index != -1) {
                    minDist = Math.min(minDist, word2Index - word1Index);
                }
            }
        }
        
        return minDist;
        
        
    }
}