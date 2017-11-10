import java.util.Scanner;

public class CMM28 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			String str="";
			for(int i=1; i<=a; i++)
			{
				if(i%7==0 && i%5==0)str =str +" "+i;
			}
			System.out.println(str.substring(1,str.length()));
		}

	}

}
