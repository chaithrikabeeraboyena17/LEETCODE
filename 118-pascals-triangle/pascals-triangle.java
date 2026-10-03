class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> l=new ArrayList<>();
      for(int i=0;i<numRows;i++){
        l.add(list(i));
      }
      return l;
        
    }
    public List<Integer> list(int row){
        List<Integer> al=new ArrayList<>();
        al.add(1);
        long ans=1;
        for(int i=0;i<row;i++){
            ans=ans*(row-i);
            ans=ans/(i+1);
            al.add((int)ans);
        }
        return al;
    }
    
}