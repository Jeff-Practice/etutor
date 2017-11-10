import java.util.Scanner;

public class CMM15 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int x =cin.nextInt();
			int y =cin.nextInt();
			if(x>100||y>100)System.out.println("outside");
			else {
				System.out.println("inside");
			}
		}

	}

}
