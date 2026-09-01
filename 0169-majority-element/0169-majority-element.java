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



//broute force
// for(int i=0;i<nums.length;i++){
//     int count=0;
//     for(int j=0;j<nums.length;j++){
//         if(nums[i]==nums[j]){
//             count++;
//         }
//     }


// if(count>nums.length/2){
//     return nums[i];
// }
//     }
// return -1;




//sorting

Arrays.sort(nums);
int freq=1;
for(int i=1;i<nums.length;i++){
    if(nums[i]==nums[i-1]){
         freq++;
    }else{
        freq=1;
    }


if(freq>nums.length/2){
    return nums[i];
}
}
return nums[0];
}

}