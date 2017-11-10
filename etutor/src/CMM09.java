import java.util.Scanner;

public class CMM09 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		while (cin.hasNext()) {
			long sum=1;
			int a = cin.nextInt();
			if(a==0)System.out.println(1);
			else if(a>31)System.out.println("Value of more than 31");
			else {
				for(int i =1; i<=a; i++)
				{
					sum=sum<<1;
				}
				System.out.println(sum);
			}
		}
	}

}
