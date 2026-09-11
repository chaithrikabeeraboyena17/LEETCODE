class Solution {
    public boolean isHappy(int n) {
    HashSet<Integer> hs=new HashSet<>();

        while(n!=1){
            if(hs.contains(n)){ 
            return false;
            }
            hs.add(n);
         int num=0;
       while(n>0){
       int digit=n%10;
        num+=digit*digit;
         n=n/10;
       }
       n=num;
        }
    
        return true;
    }
}