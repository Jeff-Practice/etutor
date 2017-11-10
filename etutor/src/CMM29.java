import java.util.Scanner;

public class CMM29 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int asnwer=0;
		while (cin.hasNext()) {
			int a = cin.nextInt();
			boolean flag = true;
			
			for(int i =a-1;i>0; i--)
			{
				flag=true;
				for(int j=2; j<i;j++)
				{
					if(i%j==0)flag=false;
				}
				if(flag){asnwer = i; break;}
			}
			System.out.println(asnwer);
			
		}

	}

}
