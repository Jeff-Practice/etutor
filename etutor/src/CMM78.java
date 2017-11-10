import java.util.Scanner;

public class CMM78 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			String str ="";
			if(a==0) a=1;
			for(int i=a;i<=b; i++)
			{
				int sum=0;
				for(int j=1; j<i; j++)
				{
					if(i%j==0)sum+=j;
				}
				if(sum==i)str=str +" " +i;
			}
			System.out.println(str.substring(1,str.length()));
			
		}

	}

}
