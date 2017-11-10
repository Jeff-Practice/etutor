import java.util.Scanner;

public class CMM32 {
	public static void main (String[] args){

		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			double sum=0,temp=0;
			for(int i = 0;i<3; i++)
			{
				temp = Math.pow(Integer.parseInt(Integer.toString(a).substring(i,i+1)), 3);
				sum+=temp;
			}
			if(sum==a)System.out.println("Yes");
			else System.out.println("No");
	}
		
		
	}
}
