class Solution {
    public int indexFinder(int t,int arr[]){
        for(int i=0;i<arr.length;i++){
            if(t==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public int dominantIndex(int[] nums) {
        int n=nums.length-1;
        int arr[]=new int[n+1];
        System.arraycopy(nums,0,arr,0,n+1);
        Arrays.sort(nums);
        if(nums[n]>=(2*(nums[n-1]))){
            return indexFinder(nums[n],arr);
        }
        return -1;
    }
}