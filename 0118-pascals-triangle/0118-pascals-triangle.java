class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer>row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0|j==i){
                    row.add(1);
                }else{
                    int left=ans.get(i-1).get(j-1);
                    int right=ans.get(i-1).get(j);

                    int sum=left+right;
                    row.add(sum);
                }
            }
            ans.add(row);
        }

        return ans;
    }
}