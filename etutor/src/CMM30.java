import java.util.Scanner;

public class CMM30 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			boolean flag = true;
			if(a%2==0) flag=false;
			for(int i=3; i<a; i=i+2)
			{
				if(a%i==0)flag=false;
			}
			if(flag)System.out.println("YES");
			else System.out.println("NO");
			
		}

	}

}
