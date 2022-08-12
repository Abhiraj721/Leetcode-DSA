class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int a_pointer=0;
            if(s1.equals(s2))return true;
            int b_pointer=s2.length()-1;
            while(a_pointer<b_pointer){
                    if(helper(a_pointer,b_pointer,s2 ,s1)){
                            return true;
                    }
                if(s2.charAt(a_pointer)==(s1.charAt(a_pointer)))a_pointer++;
                else if(s2.charAt(b_pointer)==(s1.charAt(b_pointer)))b_pointer--;
                    else{
                            a_pointer++;
                            b_pointer--;
                    }
            }
            return false;
    }
        public boolean helper(int i,int j,String s2,String s1){
                char s2arr[]=s2.toCharArray();
                System.out.print(Arrays.toString(s2arr));
               char  temp=s2arr[i];
                s2arr[i]=s2arr[j];
                s2arr[j]=temp;
                String check=new String(s2arr);
                if(check.equals(s1))return true;
                return false;
                
        }
}