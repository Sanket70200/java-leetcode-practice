class Solution {
    public int[] twoSum(int[] nums, int target) {
    // Map<Integer,Integer> map = new HashMap<>();

    // for(int i=0;i<nums.length;i++){
    //     int complament=target-nums[i];
    //     if(map.containsKey(complament)){
    //         return  new int[]{map.get(complament),i};
    //     }
    //     map.put(nums[i],i);
    // }
    // return new  int []{};


    //Broute force
    // int ans[]=new int[2];

    // for(int i=0;i<nums.length;i++){
    //     for(int j=i+1;j<nums.length;j++){
    //         if(nums[i]+nums[j]==target){
    //             ans[0]=i;
    //             ans[1]=j;
    //         }
    //     }
    // }
    // return ans;



    Map<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int complament=target-nums[i];

        if(map.containsKey(complament)){
            return new int[]{map.get(complament),i};
        }
        map.put(nums[i],i);
    }
    return new int []{};
}
}