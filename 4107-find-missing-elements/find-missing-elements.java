class Solution {
    public List<Integer> findMissingElements(int[] nums) {
      HashSet<Integer> hs=new HashSet<>();
      int mini=Integer.MAX_VALUE;
      int maxi=Integer.MIN_VALUE;
      for(int num:nums){
            maxi=Math.max(num,maxi);
            mini=Math.min(num,mini);
            hs.add(num);
      }
      List<Integer> l=new ArrayList<Integer>();
      for(int i=mini;i<maxi;i++){
        if(!hs.contains(i)){
            l.add(i);
        }
      }
      return l;
    }
}