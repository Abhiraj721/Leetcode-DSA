//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
       ArrayList<String>res=new ArrayList<>();
       backtrack(m,"",0,0,res);
       Collections.sort(res);
       return res;
    }
   static public void backtrack(int[][] m,String p,int r,int c,ArrayList<String>res)
    {
        if(m[r][c]==0)return;
       if(r==m.length-1 && c==m.length-1)
       {
           res.add(p);
           return;
       }
        m[r][c]=0;
       if(r<m.length-1)
       {
           backtrack(m,p+"D",r+1,c,res);
       }
       if(c<m.length-1)
       {
           backtrack(m,p+"R",r,c+1,res);
       }
       if(r>0)
       {
           backtrack(m,p+"U",r-1,c,res);
       }
       if(c>0)
       {
           backtrack(m,p+"L",r,c-1,res);
       }
       m[r][c]=1;
    }
}