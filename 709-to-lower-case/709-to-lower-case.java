class Solution {
    public String toLowerCase(String s) {
          StringBuilder res=new StringBuilder();
     for(int i=0;i<s.length();i++){
             if('A'<=s.charAt(i) && s.charAt(i)<='Z')res.append(Character.toLowerCase(s.charAt(i)));
             else res.append(s.charAt(i));
     }
            return res.toString();
    }
}