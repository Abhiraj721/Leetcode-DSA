class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
            int res=0;
            int i=0;
            int divisor=0;
            for( i=1;i<salary.length-1;i++) {
            divisor++;
            res+=salary[i];
            }
                               

            return (double)res/divisor;
    }
}