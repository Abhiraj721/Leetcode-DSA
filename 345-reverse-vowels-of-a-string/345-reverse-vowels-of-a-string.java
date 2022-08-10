class Solution {
    public String reverseVowels(String s) {
        StringBuilder res=new StringBuilder();
        for(char c:s.toCharArray()){
                 if(c=='a' || c=='e' ||c=='i'|| c=='o'||c=='u' ||c=='A' || c=='E' ||c=='I'|| c=='O'||c=='U') res.append(c);
        }
            String vowels=res.toString();
            char vo[]=vowels.toCharArray();
            int index=vo.length-1;
            StringBuilder ans=new StringBuilder();
                 for(char c:s.toCharArray()){
                 if(c=='a' || c=='e' ||c=='i'|| c=='o'||c=='u' ||c=='A' || c=='E' ||c=='I'|| c=='O'||c=='U') {
                         ans.append(vo[index--]);
                         
                 }else{
                         ans.append(c);
                 } 
        }
            return ans.toString();
    }
}