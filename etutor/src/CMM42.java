import java.text.NumberFormat;
import java.util.Scanner;

public class CMM42 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			NumberFormat nf = NumberFormat.getInstance();
			nf.setMaximumFractionDigits(3);
			nf.setMinimumFractionDigits(3);
			int n = cin.nextInt();
			double answer=0;
			for(int i =1;i<n+1; i++)
			{
				double a = Math.pow(-1, i+1);
				double b = 2*i-1;
				answer+=a/b;
			}
			
			System.out.println( nf.format((double)Math.round(answer*1000)/1000 ));
			
		}

	}

}
