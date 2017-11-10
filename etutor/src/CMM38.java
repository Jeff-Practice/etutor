import java.util.Scanner;
import java.util.Arrays;

public class CMM38 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String [] str = cin.nextLine().split(" ");
			int [] number = new int[3];
			for(int i=0; i<3; i++)
			{
				number[i] = Integer.parseInt(str[i]);
			}
			Arrays.sort(number);
			if(number[2]<number[1]+number[0]) System.out.println("fit");
			else System.out.println("unfit");
		}

	}

}
