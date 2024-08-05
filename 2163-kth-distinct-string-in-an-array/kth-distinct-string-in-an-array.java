class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> h = new HashMap<>();
        for (String v : arr) {
            h.put(v, h.getOrDefault(v, 0) + 1);
        }
        for (String v : arr) {
            if (h.get(v) == 1) {
                --k;
                if (k == 0) {
                    return v;
                }
            }
        }
        return "";
    }
}