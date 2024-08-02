class Solution {
    public String finalString(String s) {
        StringBuilder  st = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch!='i') st.append(ch);
            else st.reverse();
        }
        return st.toString();
    }
}