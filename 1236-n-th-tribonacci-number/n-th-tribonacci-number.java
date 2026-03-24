class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }else if(n==1||n==2){
            return 1;
        }else{
            int firstterm=0;
            int secondterm=1;
            int thirdterm=1;
            for(int i=1;i<=n;i++){

                int forthterm=firstterm+secondterm+thirdterm;
                firstterm=secondterm;
                secondterm=thirdterm;
                thirdterm=forthterm;
            }
            return firstterm;
        }
        
    }
}