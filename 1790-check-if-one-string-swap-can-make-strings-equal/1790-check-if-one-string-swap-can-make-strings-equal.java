class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))return true;
            int []arr=new int[100];
            int index=0;
         for(int i=0;i<s2.length();i++){
                 if(s1.charAt(i)!=s2.charAt(i))arr[index++]=i;
         }
            if(arr[2]!=0)return false;
           char[] newarr=s2.toCharArray();
            char temp=newarr[arr[0]];
            newarr[arr[0]]=newarr[arr[1]];
            newarr[arr[1]]=temp;
            String new_s2=new String(newarr);
            if(s1.equals(new_s2))return true;
            return false;
            
    }
}