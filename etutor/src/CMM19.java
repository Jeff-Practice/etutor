import java.util.Scanner;

public class CMM19 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int time=cin.nextInt();
			double paymoney;
			if(time<=800)
			{
				paymoney = time*0.9;
			}
			else if(time<1500) {
				 paymoney=time*0.9*0.9;
			}
			else {
				paymoney = time*0.9*0.79;
			}
			//System.out.println("%.2f", paymoney);
			System.out.printf("%.1f", paymoney);
			System.out.println();
		}

	}

}
