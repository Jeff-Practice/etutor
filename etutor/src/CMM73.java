import java.util.Scanner;

public class CMM73 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int N=cin.nextInt();
			int K=cin.nextInt();
			for(int i =1; i<=N; i++)
			{
				K=(K+1) *2;
			}
			System.out.println(K);
		}

	}

}
