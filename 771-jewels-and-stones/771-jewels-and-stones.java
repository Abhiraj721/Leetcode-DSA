class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character>set=new HashSet<>();
            for(char c:jewels.toCharArray()){
                    set.add(c);
            }
            System.out.print(set);
            int ans=0;
            for(char c:stones.toCharArray()){
                    if(set.contains(c))ans++;
            }
            return ans;
    }
}