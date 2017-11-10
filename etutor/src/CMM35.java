import java.util.Scanner;

public class CMM35 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			if(a%400==0 ||(a%100!=0 && a%4==0))System.out.println("Bissextile Year");
			else System.out.println("Common Year");
			
		}

	}

}
