class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int n=divisors.length;
        Arrays.sort(divisors);
        int m=nums.length;
        int res=divisors[0],prev=0;
        int count=0;
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<m;j++){
                if((nums[j]) % (divisors[i])==0){
                    count++;
                }
            }
            if(prev<count){
                res=divisors[i];
                prev=count;
            }
        }
        return res;
    }
}