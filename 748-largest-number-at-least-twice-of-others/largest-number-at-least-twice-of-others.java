class Solution {
    public int dominantIndex(int[] nums) {
    int max=0;
    int secMax=0;
    int maxIdx=-1;
    for(int i=0;i<nums.length;i++){ 
     if(nums[i]>max){
        secMax=max;
        max=nums[i];
        maxIdx=i;
     }
     else if(nums[i]>secMax){
        secMax=nums[i];
     }
    }
    return (secMax*2)<=max?maxIdx:-1;
   
    }
}