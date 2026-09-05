class Solution {
    public int maxProduct(int[] nums) {
    //     int max1=0;
    //    int max2=0;

    //    for(int i=0;i<nums.length;i++){
    //     if(nums[i]>max1){
    //         max2=max1;
    //         max1=nums[i];
    //     }else if(nums[i]>max2){
    //         max2=nums[i];
    //     }
    //    }
    //     int ans=(max1-1)*(max2-1);
       
    //    return ans;




int max=-1;
int smax=-1;
int n=nums.length;
for(int i=0;i<n;i++){
    if(max<nums[i]){
        smax=max;
        max=nums[i];
    }else if(smax<nums[i]){
        smax=nums[i];
    }
}
int ans=(max-1)*(smax-1);
return ans;
    }
    }





