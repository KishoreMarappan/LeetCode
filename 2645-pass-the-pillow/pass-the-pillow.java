class Solution {
    public int passThePillow(int n, int time) {
        int groups = time / (n - 1);
        return groups % 2 == 0 ? (time % (n - 1) + 1) : (n - time % (n - 1));
    }
}