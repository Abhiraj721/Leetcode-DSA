class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>res=new ArrayList<>();
            if(digits.equals("")) return res;
            String []options={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
            backtrack(Integer.parseInt(digits),"",options,res);
            return res;
    }
        public void backtrack(int num,String output_string,String []options,List<String>res){
                if(num==0){
                        res.add(output_string);
                        return;
                }
                int n1=num%10;
                String main=options[n1];
                for(int i=0;i<main.length();i++){
                        backtrack(num/10,main.charAt(i)+output_string,options,res);
                }
        }
}