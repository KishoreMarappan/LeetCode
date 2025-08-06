class Solution {
    public int countHillValley(int[] nums) {
        int counts = 0,lastValue = 0,n=nums.length-1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i + 1]) {
                if ((nums[i] > nums[lastValue] && nums[i] > nums[i + 1]) || 
                    (nums[i] < nums[lastValue] && nums[i] < nums[i + 1])) {
                    counts++;
                }
                lastValue = i;
            }
        }
        return counts;


    }
}