class Solution {
    public boolean canJump(int[] nums) {
        int d=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(d<=(nums[i]+i)){
                d=i;
            }
        }
        return d==0;
    }
}