import java.util.Scanner;

public class CMM21 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			long sum=1;
			int rundex=cin.nextInt();
			if(rundex!=0){
				for(int i = rundex; i>0; i--)
				{
					sum*=i;
				}
			}
			
			System.out.println(sum);
		}

	}

}
