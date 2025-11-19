class Solution {
    public int findFinalValue(int[] nums, int original) {
        int flag=0;
        HashSet<Integer>h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
        do{
            if(!h.add(original)){
                original=original*2;
            }
            else{
                flag=1;
            }
            
        }while(flag==0);
        return original;
    }
}