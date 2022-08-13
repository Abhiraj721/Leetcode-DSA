class Solution {
    public double myPow(double x, int n) {
            if(x<=0.00001 && x>-0.00001){
                    System.out.print("nice");
                    return (double)0;
            }
            if(x==(double)1)return (double)1;
            if(n==0)return 1;
            boolean isnegative=false;
            if(n<0){
                    isnegative=true;
                    n*=-1;
                    
            }
                     if(n<-100000 || n>1000000){
                             if(x<0){
                                     if(n<0)return (double)1;
                                     else{
                                           return (double)-1;}
                                     }
                                     
                        else{
                                return (double)0;
                        }
                     }
            double partial_ans=myPow(x,n-1);
            if(isnegative){
                    return  1.0/(x*partial_ans);
            }
            return x*partial_ans;
    }
}