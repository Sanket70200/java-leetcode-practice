class Solution {
    public boolean isPalindrome(int x) {
  int revnum=0;
  int n=x;
  if(x<0){
    return false;
  }

  while(n>0){
    int digit=n%10;
    revnum=revnum*10+digit;
    n=n/10;
  }

  if(revnum==x){
    return true;
  }else{
    return false;
  }
    }
    
}