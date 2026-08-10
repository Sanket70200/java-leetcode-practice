class Solution {
    public int majorityElement(int[] nums) {

// int n=nums.length;
// int freq=0;
// int ans=0;
// for(int i=0;i<n;i++){
//     if(freq==0){
//         ans= nums[i];
//     }
//     if(ans == nums[i]){
//         freq++;
//     }else{
//         freq--;
//     }

// }
// return ans;


for(int i=0;i<nums.length;i++){
    int count=0;
    for(int j=0;j<nums.length;j++){
        if(nums[i]==nums[j]){
            count++;
        }
    }


if(count>nums.length/2){
    return nums[i];
}
    }
return -1;
}

}