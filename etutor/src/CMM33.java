import java.util.Scanner;

public class CMM33 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			String str =""; 
			for(int i = 2; i<=a; i++)
			{
				int sum=0;
				for(int j=1; j<i; j++)
				{
					if(i%j==0)sum+=j;
				}
				if(sum==i)str +=" " + i;
			}
			System.out.println(str.substring(1,str.length()));
			
		}

	}
}
