import java.util.Scanner;

public class CMM45 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int rundex = cin.nextInt();
		String [][] gift = new String[rundex][2];//0=people 1=gift
		for(int i =1; i<=rundex; i++)
		{
			gift[i]=cin.nextLine().split(" ");
		}
		
	}

}
