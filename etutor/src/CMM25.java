import java.util.Scanner;

public class CMM25 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int sum=0;
			for(int i=3; i<=a; i=i+3)
			{
				sum+=i;
			}
			System.out.println(sum);
			
		}

	}

}
