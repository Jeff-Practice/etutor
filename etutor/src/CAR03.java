import java.util.Scanner;

public class CAR03 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int [] number =new int [6];
			for(int i =0; i<6;i++)
			{
				number[i]=cin.nextInt();
			}
			System.out.println((int)(Math.pow(number[0], 3)+Math.pow(number[1], 3) + Math.pow(number[2], 3) + Math.pow(number[3], 3)+Math.pow(number[4], 3)+Math.pow(number[5], 3)));
		}
	}

}
