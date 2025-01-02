class Solution {
    public int[] vowelStrings(String[] w, int[][] q) {
        int n=w.length;
        int t[]=new int[n];
        int l=q.length;
        int res[]=new int[l];
        int s=0;
        for(int i=0;i<n;i++){
            if(isCheck(w[i])){
                if(i==0){
                    t[i]=1;  
                }
                else {
                    t[i]=t[i-1]+1;
                }
                s+=t[i];
            }
            else{
                if(i==0){
                    t[i]=0;  
                }
                else
                    t[i]=t[i-1];
            }
        }
        for(int j=0;j<l;j++){
            int lt = q[j][0];
            int rt = q[j][1];
            if (lt == 0) {
                res[j] = t[rt];  
            } else {
                res[j] = t[rt] - t[lt - 1];  
            }
        }
        return res;        
    }
    public static boolean isCheck(String s){
        int y=s.length();
        String str = "aeiouAEIOU";
        if(str.indexOf(s.charAt(0))==-1){
            return false;
        }
        if(str.indexOf(s.charAt(y-1))==-1){
            return false;
        }
        return true;
    }
}