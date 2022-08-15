class Solution {
    public String interpret(String command) {
        StringBuilder ans=new StringBuilder();
            for(int i=0;i<command.length();i++){
                    if(command.charAt(i)=='G')ans.append("G");
                    else if( i!=command.length()-1 && command.charAt(i)=='(' && command.charAt(i+1)!='a')ans.append("o");
                    else if(command.charAt(i)=='a'){
                            ans.append("al");
                            i++;
                    }
            }
            return ans.toString();
    }
}