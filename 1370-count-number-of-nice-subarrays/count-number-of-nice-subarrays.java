class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int c=0,s=0;
        Map<Integer,Integer>ps = new HashMap<>();
        ps.put(0,1);
        for(int i=0;i<nums.length;i++){
            c+=nums[i]%2;
            if(ps.containsKey(c-k)){
                s+=ps.get(c-k);
            }
            ps.put(c,ps.getOrDefault(c,0)+1);
        }
        return s;
    }
}