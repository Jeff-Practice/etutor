import java.util.Scanner;

public class CMM26 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			for(int i =1; i<=a; i++)
			{
				System.out.println(i + "*" + i +"=" + i*i);
			}
		}

	}

}
