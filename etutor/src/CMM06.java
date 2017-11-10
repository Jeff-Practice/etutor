import java.util.Scanner;

public class CMM06 {

	public static void main(String[] args) {
		Scanner cin =new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			System.out.println( (double)Math.round((a*1.6*10))/10 );
			
		}

	}

}
