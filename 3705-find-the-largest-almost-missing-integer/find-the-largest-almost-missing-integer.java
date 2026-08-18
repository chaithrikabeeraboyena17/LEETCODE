class Solution {
    public int largestInteger(int[] nums, int k) {
      Map<Integer,Integer> count=new HashMap<>();
     for(int num:nums){
        count.put(num,count.getOrDefault(num,0)+1);
     }
    
     if(k==nums.length){
        int m=0;
        for(int num:nums){
          m=Math.max(m,num);
        }
        return m;
     }
      int ans=-1;
     if(k==1){
        for(int num:nums){
            if(count.get(num)==1){
                ans=Math.max(ans,num);
            }
        }
     }
     else{
        if(count.get(nums[0])==1){
            ans=Math.max(ans,nums[0]);
        }
        if(count.get(nums[nums.length-1])==1){
           ans=Math.max(ans,nums[nums.length-1]);  
        }
     }
     return ans;
    }
    }