class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
     HashSet<Integer> hs=new HashSet<>();
     int m=Integer.MAX_VALUE;
     for(int num:nums){
        hs.add(num);
     } 
     List<Integer> l=new ArrayList<>();
    for(int i=1;i<=nums.length;i++){
        if(!hs.contains(i)){
            l.add(i);
        }
    } 
     return l;

    }
}