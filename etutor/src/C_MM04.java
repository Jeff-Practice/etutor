import java.util.Scanner;

public class C_MM04���p���`�M���n�t�өM�l�� {

	public static void main(String[] args) {
		Scanner cin  =new Scanner(System.in);
		while(cin.hasNext())
		{
			int a = cin.nextInt();
			int b = cin.nextInt();
			System.out.printf("%d+%d=%d\n", a, b, a + b);
			System.out.printf("%d+%d=%d\n", a, b, a * b);
			System.out.printf("%d+%d=%d\n", a, b, a - b);
			System.out.printf("%d/%d=%d...%d\n", a, b, a / b, a % b);
		}

	}

}
