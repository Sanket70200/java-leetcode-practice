class Solution {
     void sortColors(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(mid <= end){
            switch(nums[mid]){
                case 0:
                swap(nums,mid,start);
                mid++;
                start++;
                break;

                case 1:
                mid++;
                break;

                case 2:
                swap(nums,mid,end);
           
                end--;
            }
        }
    }


    public void swap(int arr[],int pos1,int pos2){
        int temp=arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=temp;
    }
}