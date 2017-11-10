import java.util.Scanner;

public class CMM24 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			double salay=0;
			int a = cin.nextInt();
			int b = cin.nextInt();
			if(a<=60)
			{
				salay = a*b;
			}
			if(a>60 && a<=120)
			{
				salay = 60*b;
				salay = salay + (a-60)*b*1.33;
			}
			if (a>120) {
				salay = 60*b;
				salay = salay + 60*b*1.33;
				salay = salay + (a-120)*b*1.66;
			}
			System.out.println(salay);
			
		}
	}

}
