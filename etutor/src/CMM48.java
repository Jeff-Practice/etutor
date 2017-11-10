import java.util.Scanner;

public class CMM48 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int rundex = cin.nextInt();
		for(int i =1; i<=rundex; i++)
		{
			System.out.println(f91(cin.nextInt()));
		}
	}
	public static int f91(int n) {
		if(n<101)return f91(f91(n+11));
		else return n-10;
	}

}
