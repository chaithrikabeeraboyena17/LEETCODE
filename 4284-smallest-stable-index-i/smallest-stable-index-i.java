class Solution {
    public int firstStableIndex(int[] nums, int k) {
    // // int[] arr=new int[nums.length];
    // int max1=Integer.MIN_VALUE;

    // for(int i=0;i<nums.length;i++){
    //       max1=Math.max(nums[i],max1);
    //        int min1=Integer.MAX_VALUE;
    //     for(int j=i;j<nums.length;j++){
    //         // arr[i]=nums[i];
    //         min1=Math.min(min1,nums[j]);

    //     }
    //     if(max1-min1<=k){
    //         return i;
    //     }
    // }

    // return -1;
    int[] prefix=new int[nums.length];
    prefix[0]=nums[0];
    for(int i=1;i<nums.length;i++){
        prefix[i]=Math.max(prefix[i-1],nums[i]);
    }
    int suffix=nums[nums.length-1];
    for(int i=nums.length-1;i>=0;i--){  
        suffix=Math.min(suffix,nums[i]);
        prefix[i]=prefix[i]-suffix;
    }   
    
     for(int i=0;i<nums.length;i++){
         if(prefix[i]<=k){
            return i;
         }
     }
     return -1;

    }
}