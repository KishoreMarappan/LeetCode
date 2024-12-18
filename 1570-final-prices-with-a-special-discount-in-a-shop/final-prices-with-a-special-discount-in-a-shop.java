class Solution {
    public int[] finalPrices(int[] p) {
        int n=p.length;
        int res[]=new int[n];
        for(int i=0;i<n-1;i++){
            res[i]=toKnow(p,i+1,p[i]);
        }
        res[n-1]=p[n-1];
        return res;
    }
    public static int toKnow(int[] a,int i,int c){
        for(int j=i;j<a.length;j++){
            if(a[j]<=c) return c-a[j];
        }
        return c;
    }
}