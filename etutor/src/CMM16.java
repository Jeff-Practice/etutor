import java.util.Scanner;

public class CMM16 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			double x = cin.nextDouble();
			double y =cin.nextDouble();
			double ans=Math.sqrt(x*x+y*y);
			if(ans<=100)
				System.out.println("inside");
			else System.out.println("outside");
			
		}

	}

}
