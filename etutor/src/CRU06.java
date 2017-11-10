import java.util.Scanner;


public class CRU06 {

	public static void main(String[] args) {
		
		Scanner cin =new Scanner(System.in);
		while(cin.hasNext())
		{
			int n = cin.nextInt();
			System.out.println(rec(n));	
		}
		
	}
	public static int rec(int n)
	{
		if(n==0 || n==1) return n+1;
		else {
			return rec(n-1)+rec((int)Math.floor(n/2));
		}
	}
}
