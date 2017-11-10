

import java.util.Scanner;

public class CMM05 {

	public static void main(String[] args) {
		Scanner cin  =new Scanner(System.in);
		while (cin.hasNext()) {
			double a = cin.nextDouble();
			System.out.println( (double)Math.round(a*a*10.0)/10 );
			
		}
	}

}
