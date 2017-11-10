import java.util.Scanner;

public class CMM40 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int sum = 1;
			String str ="1";
			if(a == 1)System.out.println("1 = 1");
			else {
				for(int i=2; i<=a; i++)
				{
					str +=" + " +i; 
					sum+=i;
				}
				System.out.println(str +" = " + sum);
			}
		}

	}

}
