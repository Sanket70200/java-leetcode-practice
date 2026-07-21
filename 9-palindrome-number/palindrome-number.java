class Solution {
    public boolean isPalindrome(int x) {
        // if(x<0){
        //     return false;
        // }


        // int n=x;
        // int resno=0;
        // while(n>0){
        //     int digit=n%10;
        //     resno=resno*10+digit;
        //     n=n/10;
        // }

        // if(resno==x){
        //     return true;
        // }else{
        //     return false;
        // }





        if(x<0)
        return false;


        int n=x;
        int revnum=0;
        while(n>0){
            int d=n%10;
            revnum=revnum*10+d;
             n=n/10;
        
        }

        if(revnum==x){
            return true;
        }else{
            return false;

        }
    }
}