class Solution {
    public int minSwaps(int[] nums) {
        int c=0;
        int n=nums.length;
        for(int i1 : nums){
            if(i1==1) c++;
        }
        if (c<= 1) return 0;
        int ms = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < c; i++) {
            sum += nums[i];
        }
        ms = c - sum;
        for (int i = 1; i <= n; i++) {
            sum -= nums[i - 1];
            sum += nums[(i + c - 1) % n];
            int minswap = c - sum;
            ms = Math.min(ms, minswap);
        }
        return ms;
    }
}