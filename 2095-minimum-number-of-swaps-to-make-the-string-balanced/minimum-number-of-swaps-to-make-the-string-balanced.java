class Solution {
    public int minSwaps(String s) {
        int c=0;
        Stack<Character>st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='['){
                st.push(ch);
            }
            else {
                if(!st.empty()){
                    st.pop();
                }
                else{
                    c++;
                }

            }
        }
        return (c+1)/2;
    }
}