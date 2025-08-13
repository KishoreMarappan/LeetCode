class Solution {
    public boolean isPowerOfThree(int n) {
         if(n==1){
            return true;
        }
        int flag=0;
        if(n%3!=0 || n<1){
            return false;
        }     
        for(int i=0;i<=31;i++)
        {
            if(Math.pow(3,i)==n){
                flag=1;
                break;
            }
        
        } 
        if(flag==1){
            return true;
        }
        return false;
    }
}