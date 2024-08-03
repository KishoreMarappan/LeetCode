
public class Solution {
    public int trap(int[] h) {
        int l=0;
        int r=h.length-1;
        int lmax=Integer.MIN_VALUE;
        int rmax=Integer.MIN_VALUE;
        int t=0;
        while(l<r){
            lmax=Math.max(lmax,h[l]);
            rmax=Math.max(rmax,h[r]);
            t+=(lmax < rmax) ? lmax - h[l++] : rmax - h[r--];
        }
        return t;

    }
}