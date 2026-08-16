//program./
class Solution {
    public int maxProduct(int[] nums) {
        
    //     int maxp=Integer.MIN_VALUE;
    //     int curr=1;
    //     for(int i=0;i<nums.length;i++){
    //         curr=curr * nums[i];
    //         maxp=Math.max(curr,maxp);
    //         if(curr == 0){
    //             curr=1;



    //         }
    //     }
    //        curr=1;
    //     for(int i=nums.length-1;i>=0;i--){
    //         curr=curr * nums[i];
    //         maxp=Math.max(curr,maxp);
    //         if(curr==0){
    //             curr=1;
    //         }
    //     }
    //     return maxp;


    int n=nums.length;
    int leftproduct=1;
    int rightproduct=1;
    int ans=nums[0];
    for(int i=0;i<n;i++){
        leftproduct=leftproduct==0?1:leftproduct;
        rightproduct=rightproduct==0?1:rightproduct;

        leftproduct*=nums[i];
        rightproduct*= nums[n-1-i];

        ans=Math.max(ans,Math.max(leftproduct,rightproduct));
    }
    return ans;
     }
}