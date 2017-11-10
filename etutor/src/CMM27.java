import java.util.Scanner;

public class CMM27 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int temp;
			if(a>b){temp=a; a=b; b=temp;} 
			int sum=0;
			for(int i=a; i<=b; i++)
			{
				sum=sum+i;
			}
			System.out.println(sum);
		}

	}

}
