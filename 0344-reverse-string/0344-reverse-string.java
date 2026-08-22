class Solution {
    public void reverseString(char[] s) {
        // StringBuilder reverse=new StringBuilder(new String(s)).reverse();
        // for(int i=0;i<s.length;i++){
        //     s[i]=reverse.charAt(i);
        // }



        // int n=s.length;
        // int left=0;
        // int right=n-1;
        // while(left<right){
        //     char ch=s[left];
        //     s[left]=s[right];
        //     s[right]=ch;
        //     left++;
        //     right--;
        // }


int n=s.length;
        int left=0;
        int right=n-1;
        for(int i=left;i<right;i++){
            char ch=s[left];
            s[left]=s[right];
            s[right]=ch;
            left++;
            right--;
        }
    }
}