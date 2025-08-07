class Solution {
    public String greatestLetter(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            if (set.contains(ch) && set.contains(Character.toLowerCase(ch))) {
                return String.valueOf(ch); // return the first match from highest to lowest
            }
        }
        return "";
    }
}