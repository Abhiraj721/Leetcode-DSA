class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer>main=new HashMap<>();
            for(int i=0;i<s.length();i++){
                    if(main.containsKey(s.charAt(i))) return s.charAt(i);
                    main.put(s.charAt(i),3);
            }
            return '#';
    }
}