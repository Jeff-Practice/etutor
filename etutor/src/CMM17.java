import java.util.Scanner;

public class CMM17 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int b =cin.nextInt();
			int temp;
			while (b!=0) {
				a=a%b;
				if(b>a)
				{
					temp =a;
					a=b; 
					b=temp;
				}
			}
			System.out.println(a);
		}

	}

}
