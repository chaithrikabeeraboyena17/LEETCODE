class Solution {
    public int longestConsecutive(int[] nums) {
     HashSet<Integer> hs=new HashSet<>();
     if(nums.length==0){
        return 0;
     }
     for(int num:nums){
        hs.add(num);
     }
     
     int maxi=0;
     for(int num:hs){
        if(!hs.contains(num-1)){
           int currNum=num;
           int longest=1;
           while(hs.contains(currNum+1)){
            currNum++;
             longest++;  
           }
          maxi=Math.max(longest,maxi);  
     }
     }
     
    return maxi;
    }
}