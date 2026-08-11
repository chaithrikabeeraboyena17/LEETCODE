class Solution {
    public int missingInteger(int[] nums) {
    // HashSet<Integer> hs=new HashSet<>(); 
    //     for(int num:nums){
    //         hs.add(num);
    //     }
    //     int sum=nums[0];
    //     for(int i=1;i<nums.length;i++){
    //         if(nums[i]==nums[i-1]+1){
    //             sum+=nums[i];
    //         }
    //         else{
    //             break;
    //         }
    //     }
    //     while(hs.contains(sum)){
    //         sum++;
    //     }
    //     return sum;
    int sum=nums[0];
    for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[i-1]+1)
            sum+=nums[i];
        else break;
    }
    int x=sum;
    while(true){
        boolean found=false;
        for(int num:nums){
            if(num==x){
                found=true;
                break;
            }
        }
        if(!found){
           return x; 
        }
        x++;
    }
    
    }
}