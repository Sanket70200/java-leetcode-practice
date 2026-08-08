class Solution {
    public void reverseString(char[] s) {
        StringBuilder reverse=new StringBuilder(new String(s)).reverse();
        for(int i=0;i<s.length;i++){
            s[i]=reverse.charAt(i);
        }
    }
}