import java.util.Scanner;

public class CMM70 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int b = n;
			int a=0;
			for(int i = 1; i<b; i++)
			{
				b=b-i;
				a++;
			}
			System.out.println(a);
		}

	}

}
