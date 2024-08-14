class Solution {
    public int[] frequencySort(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int r : nums){
            h.put(r,h.getOrDefault(r,0)+1);
        }
        int j=0;
        List<Map.Entry<Integer,Integer>>li= new ArrayList<>(h.entrySet());
        li.sort((a,b)->{
            int r=Integer.compare(a.getValue() , b.getValue());
            if(r!=0){
                return r;
            }
            return Integer.compare(b.getKey(),a.getKey());
        });
        for(Map.Entry<Integer, Integer> e : li){
            int d=e.getKey();
            int n=e.getValue();
            while(n>0){
                nums[j++]=d;
                n--;
            }
        }
        return nums;
    }
}