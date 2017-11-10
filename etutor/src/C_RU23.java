import java.util.Scanner;

public class C_RU23 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext())
		{
			int a =cin.nextInt();
			System.out.printf("%.5f\n",fn(a));
		}
	}
	public static double fn(int n)
	{
		if(n==1) return 1;
		else return (fn(n-1)+2)/2;
	}

}
