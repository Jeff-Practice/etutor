import java.math.BigInteger;
import java.util.Scanner;

public class CRU01 {
	
	static BigInteger sum = new BigInteger("1");
	static BigInteger index = new BigInteger("1");
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		//int rundex = cin.nextInt();
		
		//for(int i=1; i<=rundex; i++)
		//{
			int count = cin.nextInt();
			BigInteger ax =new BigInteger(Integer.toString(count));
			rec(ax);
			System.out.println(sum);
		//}

	}
	public static void rec(BigInteger count) {
		if(count.equals("1")) return;
		else{
			sum.multiply(count);
			rec(count.subtract(index));
			
		}
	}

}
