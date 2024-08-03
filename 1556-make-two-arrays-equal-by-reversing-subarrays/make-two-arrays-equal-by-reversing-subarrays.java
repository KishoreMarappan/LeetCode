class Solution {
    public boolean canBeEqual(int[] t, int[] arr) {
        Arrays.sort(t);
        Arrays.sort(arr);
        return Arrays.equals(arr,t);
    }
}