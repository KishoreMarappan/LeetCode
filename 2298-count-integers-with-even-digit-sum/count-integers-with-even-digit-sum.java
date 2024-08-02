class Solution {
    public int countEven(int num) {
        int y=4;
        if(num<10) return num/2;
        if(num==10) return y;
        for(int i=11;i<=num;i++){
            if(isSum(i)){
                y++;
            }
        }
        return y;
    }
    public static boolean isSum(int n){
        int sum=0,r=0;
        while(n>0){
            r=n%10;
            sum+=r;
            n=n/10;
        }
        return sum%2==0;
    }
}