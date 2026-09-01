class Solution {
    public int missingNumber(int[] nums) {
//       int n=nums.length;
//       int actualvalue=n*(n+1)/2;
//       int currentSum=0;
//       for(int i=0;i<nums.length;i++){
// currentSum+=nums[i];
//       }

//       int ans=actualvalue-currentSum;
//       return ans;


int n=nums.length;
int actualSum=n*(n+1)/2;
int curr=0;
for(int i=0;i<n;i++){
 curr+=nums[i];
}

int ans=actualSum-curr;
  return ans;
    }
  
}