class Solution {
    public String reverseWords(String s) {
        String reverse=reverse(s);
        int count=0;
            String ans="";
            StringBuilder res=new StringBuilder();
            while(count<s.length()){
                    if(count<s.length())
                 ans="";
                    while(count<s.length()&& s.charAt(count)!=' '){ 
                            ans+=s.charAt(count);
                            // System.out.print(count+" "+ans);
                                count++;
                                                };
                    String reversed=reverse(ans);
                    res.append(reversed);
                    if(count<s.length())res.append(" ");
                    count++;
            }
            return res.toString();
    }
        public String reverse(String s){
                String reversed="";
                for(int i=0;i<s.length();i++){
                        reversed=s.charAt(i)+reversed;
                }
                return reversed;
        }
}