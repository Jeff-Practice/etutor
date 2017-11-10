import java.util.Scanner;

public class CMM34 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			String str = "";
			for(int i =1 ; i<=a; i++)
			{
				if(a%i==0) str+=" " + i;
			}
			System.out.println(str.substring(1,str.length()));
		}

	}

}
