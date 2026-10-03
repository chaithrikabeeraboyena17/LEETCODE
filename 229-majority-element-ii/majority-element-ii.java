class Solution {
    public List<Integer> majorityElement(int[] nums) {
      HashMap<Integer,Integer> hs=new HashMap<>();
      for(int num:nums){
        hs.put(num,hs.getOrDefault(num,0)+1);
      }
      int majority=nums.length/3;
      List<Integer> l=new ArrayList<>();
      for(int num:nums){
        if(hs.get(num)>majority && !l.contains(num)){
            l.add(num);
        }
      } 
      return l;
    }
}