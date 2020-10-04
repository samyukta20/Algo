class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(br.readLine());
	    while(t-- > 0)
	    {
	        //2147483646 Max int size
	        int n=Integer.parseInt(br.readLine().trim());
	        String s[]=br.readLine().split(" ");
	        long a[]=new long[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]=Long.parseLong(s[i]);
	        }
	        Stack<Long> stack=new Stack<>();
	        List<Long> list=new ArrayList<>();
	        for(int i=n-1;i>=0;i--)
	        {
	            if(stack.isEmpty())
	            {
	                list.add((long)-1);
	            }
	            else if(stack.peek()>a[i])
	            {
	                list.add(stack.peek());
	            }
	            else if(stack.peek()<=a[i])
	            {
	                while(!stack.isEmpty() && a[i]>=stack.peek())
	                {
	                    stack.pop();
	                }
	                if(stack.isEmpty())
	                {
	                    list.add((long)-1);
	                }
	                else
	                {
	                    list.add(stack.peek());
	                }
	            }
	            stack.push(a[i]);
	        }
	        Collections.reverse(list);
	        for(Long i: list)
	        {
	            System.out.print(i+" ");
	        }
	        System.out.println();
	    }
		
	}
}
