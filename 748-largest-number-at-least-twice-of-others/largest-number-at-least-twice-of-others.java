class Solution {
    public int dominantIndex(int[] nums) {
    int m1=0;
    int m2=0;
    for(int num:nums){
        if(num>m1){
            m2=m1;
            m1=num;
        }
        else if(num>m2){
            m2=num;
        }
    } 
    for(int i=0;i<nums.length;i++){ 
    if(m1>=(m2*2)&& m1==nums[i]){
     return i;  
    }
    }
    return -1;
    }
}