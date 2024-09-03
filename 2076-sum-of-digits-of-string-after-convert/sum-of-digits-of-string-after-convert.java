class Solution {
    public int getLucky(String s, int k) {
        int r=0;
        for(char ch : s.toCharArray()){
            int sum=(ch-96);
            while(sum>0){
                r+=(sum%10);
                sum=sum/10;
            }
        }   
        if(k==1) return r;
        
        for(int i=2;i<=k;i++){
            int sm=0;
            while(r>0){
                sm+=(r%10);
                r=r/10;
            }
            r=sm;
        }
        return r;
    }
}