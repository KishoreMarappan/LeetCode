class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer>m = new HashMap<>();
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }
        
        Set<Integer>set = new HashSet<>();
        int count=0;

        for(int i : m.values()){
            int frequency=i;
            while(frequency>0 && set.contains(frequency)){
                frequency--;
                count++;
            }
            set.add(frequency);
        }
        return count;
    }
}