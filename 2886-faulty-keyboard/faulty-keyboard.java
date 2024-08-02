class Solution {
    public  static String strReverser(String t){
        StringBuilder  st = new StringBuilder(t);
        return st.reverse().toString();
    }
    public String finalString(String s) {
        String res="";
        for(char ch : s.toCharArray()){
            if(ch!='i') res+=ch;
            else res=strReverser(res);
        }
        return res;
    }
}