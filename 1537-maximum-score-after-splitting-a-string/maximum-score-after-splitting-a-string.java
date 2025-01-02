class Solution {
    public int maxScore(String s) {
        int max = 0;
        int n = s.length();
        int z = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '0') {
                z++;
            }
            int o = 0;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) == '1') {
                    o++;
                }
            }
            max = Math.max(max, o + z);
        }
        return max;
    }
}