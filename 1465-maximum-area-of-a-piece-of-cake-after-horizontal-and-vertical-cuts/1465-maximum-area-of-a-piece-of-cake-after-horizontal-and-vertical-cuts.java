class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
         ArrayList<Integer>h_diff=new ArrayList<>();
        ArrayList<Integer>v_diff=new ArrayList<>();
            h_diff.add(horizontalCuts[0]-0);
            v_diff.add(verticalCuts[0]-0);
            for(int i=0;i<horizontalCuts.length-1;i++){
                    h_diff.add(horizontalCuts[i+1]-horizontalCuts[i]);
            }
            h_diff.add(h-horizontalCuts[horizontalCuts.length-1]);
                     for(int i=0;i<verticalCuts.length-1;i++){
                    v_diff.add(verticalCuts[i+1]-verticalCuts[i]);
            }
             v_diff.add(w-verticalCuts[verticalCuts.length-1]);
            Collections.sort(v_diff);
            Collections.sort(h_diff);
          long max_from_v_diff=v_diff.get(v_diff.size()-1);
         long max_from_h_diff= h_diff.get(h_diff.size()-1);
          long M=1000000007;
            return (int)((max_from_h_diff*max_from_v_diff)%M) ;

    }
}