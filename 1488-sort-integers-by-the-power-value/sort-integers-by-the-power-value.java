class Solution {
    public int Ck(int n){
        int c =0;
        while(n!=1){
            c++;
            if(n%2==0) n=n/2;
            else n=(3*n)+1;
        }
        return c;
    }
    public int getKth(int lo, int hi, int k) {
        HashMap<Integer,Integer>li=new LinkedHashMap<>();
        for(int i=lo;i<=hi;i++){
            li.put(i,Ck(i));
        }
        List<Integer>l=new ArrayList<>(li.keySet());
        Collections.sort(l,(a,b)->{
            if(li.get(a)!=li.get(b)){
                return li.get(a)-li.get(b);
            }
            return a-b;
        });
        
        return l.get(k-1);
    }
}