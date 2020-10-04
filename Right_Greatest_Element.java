/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner x=new Scanner(System.in);
	    int t=x.nextInt();
	    while(t>0)
	    {
	        int n=x.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=x.nextInt();
	            
	        }
	        Stack<Integer> s = new Stack<Integer>();
	        Vector<Integer> v=new Vector<Integer>();
	        for(int i=n-1;i>=0;i--)
	        {
	            if(s.size()==0)
	            v.add(-1);
	            else if(s.size()>0 && s.peek()>arr[i])
	            {
	                v.add(s.peek());
	            }
	            else if(s.size()>0 && s.peek()<=arr[i])
	            {
	                while(s.size()>0 && s.peek()<=arr[i])
	                s.pop();
	                if(s.size()==0)
	                v.add(-1);
	                else
	                v.add(s.peek());
	            }
	            s.push(arr[i]);
	        }
	        for(int i=n-1;i>=0;i--)
	        {
	            System.out.print(v.get(i)+" ");
	        }
	        System.out.println();
	        t--;
	    }
	}
}
	       
