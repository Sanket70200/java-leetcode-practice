class Solution {
    public int countPrimes(int n) {
        boolean [] composite=new boolean [n];
        int limit=(int)Math.sqrt(n);
        for(int i=2;i<=limit;i++){
            if(composite[i]==false){
                for(int j=i*i;j<n;j+=i){
                    composite[j]=true;
                }
            }
        }

        int count=0;
        for( int i=2;i<n;i++){
            if(composite[i]==false){
                count++;
            }
        }
        return count;


        // int count=0;
        // for(int i=2;i<n;i++){
        //     boolean isnumber=true;
        //     for(int j=2;j<i;j++){
        //         if(i%j==0){
        //             isnumber=false;
        //             break;
        //         }
        //     }

        //     if(isnumber){
        //         count++;
        //     }
        // }
        // return count;
}
}
