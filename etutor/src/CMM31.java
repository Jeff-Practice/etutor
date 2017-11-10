import java.util.Scanner;

public class CMM31 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a =cin.nextInt();
			int sum=0;
			for(int i =1; i<=a; i++)
			{
				if(i%2==0 && i%3==0 && !(i%12==0))sum+=i;
			}
			System.out.println(sum);
		}

	}

}
