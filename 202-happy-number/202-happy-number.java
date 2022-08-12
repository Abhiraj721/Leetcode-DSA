class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer,Integer>map=new HashMap<>();
            while(n!=1 && !map.containsKey(n)){
                    map.put(n,23);
                    n=digitsum(n);
            }
            return n==1;
    }
        public int digitsum(int num){
                int sum=0;
                while(num>0){
                        int d=num%10;
                        sum+=d*d;
                        num=num/10;
                }
                return sum;
        }
}