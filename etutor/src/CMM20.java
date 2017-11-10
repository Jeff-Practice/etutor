import java.util.Scanner;

public class CMM20 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a =cin.nextInt();
			String str = Integer.toHexString(a);
			System.out.println(String.valueOf(str).toUpperCase());
			
		}

	}

}
