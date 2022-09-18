class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String []codes={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
            Set<String>set=new HashSet<>();
            String d="";
            for(String s:words){
                    d="";
                    for(char c:s.toCharArray()){
                            d+=codes[c-'a'];
                            
                    }
                   set.add(d);
            }
            return set.size();
    }
}