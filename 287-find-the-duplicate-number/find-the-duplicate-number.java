class Solution {
    public int findDuplicate(int[] nums) {
//       Set<Integer> set=new HashSet<>();
// for(int i=0;i<nums.length;i++){
//       if(set.contains(nums[i])){
//         return nums[i];
//       }

//       set.add(nums[i]);
        
//     }

//     return -1;


int slow=nums[0];
int fast=nums[0];

do{
    slow=nums[slow];
    fast=nums[nums[fast]];
}while(slow!=fast);

slow=nums[0];

while(slow!=fast){
    slow=nums[slow];
    fast=nums[fast];
}
return slow;

}
}