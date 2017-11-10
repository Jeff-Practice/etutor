import java.util.Scanner;

public class CMM11 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int hava = a;
			int ten=0,five=0,one=0;
			if(hava>=10)
				{
				ten=hava/10;
				hava =hava-ten*10;
				}
			if(hava>=5)
			{
			five=hava/5;
			hava =hava-five*5;
			}
			if(hava>0)
			{
			one=hava;
			}
			System.out.println("NT10=" + ten);
			System.out.println("NT5=" + five);
			System.out.println("NT1=" + one);
		}

	}

}
