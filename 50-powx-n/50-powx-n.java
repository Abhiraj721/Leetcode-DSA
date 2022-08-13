class Solution {
    public double myPow(double x, int n) {
       long n_copy=n;
        double ans=1.0;
            if(n_copy<0)n_copy*=-1;
            while(n_copy>0){
                if(n_copy%2==0){
                        x=x*x;
                        n_copy=n_copy/2;
                }else{
                        ans=ans*x;
                        n_copy-=1;
                }
                    
                       }
             if(n<0)ans=1.0/ans;
            return ans;
    }
}