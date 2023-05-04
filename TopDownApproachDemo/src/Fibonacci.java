import java.util.HashMap;

public class Fibonacci {
	
	static HashMap<Integer,Integer> lookup = new HashMap<Integer,Integer>();
	
	public static void main(String args[])
	{
		System.out.println(fib(7));
	}
	
	public static int fib(int n)
	{
		if(lookup.containsKey(n))
			return lookup.get(n);
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		
		int res = fib(n-1) + fib(n-2);
		
		lookup.putIfAbsent(n, res);
		
		return lookup.get(n);
		
	}

}
