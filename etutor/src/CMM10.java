import java.util.Scanner;

public class CMM10 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			double a = cin.nextDouble();
			System.out.println((double)Math.round(((a*9/5)+32)*10)/10);
			
		}

	}

}
