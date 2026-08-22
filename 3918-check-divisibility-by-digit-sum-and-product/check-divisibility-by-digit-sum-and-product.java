class Solution {
    public boolean checkDivisibility(int n) {
        int ans=0;
        int prod=1;
        int original=n;
      while(n>0){
        int digit=n%10;
           ans+=digit;
           prod*=digit;
           n/=10;
      } 
      int sum=ans+prod;
      if(original%sum==0){
        return true;
      } 
      return false;
    }
}