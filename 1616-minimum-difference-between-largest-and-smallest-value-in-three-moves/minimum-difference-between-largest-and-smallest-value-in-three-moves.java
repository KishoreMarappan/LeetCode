class Solution {
    public int minDifference(int[] nums) {
        int n=nums.length;
        if(n<=4) return 0;
        int m=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<=3;i++){
            m=Math.min(m,nums[n-(3-i)-1]-nums[i]);
        }
        return m;
    }
}