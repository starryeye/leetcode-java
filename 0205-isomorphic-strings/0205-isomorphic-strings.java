class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        
        // s, t 를 숫자 배열로 변환시킨 후 동등성 비교를 한다.
        
        List<Integer> slist = new ArrayList<>();
        List<Integer> tlist = new ArrayList<>();
        
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();
        
        int a = 0;
        int b = 0;
        
        for(int i = 0; i < s.length(); i++) {
            
            if(smap.containsKey(s.charAt(i))) {
                slist.add(smap.get(s.charAt(i)));
            }else {
                smap.put(s.charAt(i), a);
                slist.add(a++);
            }
            
            if(tmap.containsKey(t.charAt(i))) {
                tlist.add(tmap.get(t.charAt(i)));
            }else {
                tmap.put(t.charAt(i), b);
                tlist.add(b++);
            }
        }
        
        return slist.equals(tlist);
    }
}