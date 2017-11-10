import java.math.BigInteger;
import java.util.Scanner;

public class CMM95 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			BigInteger b =new BigInteger(cin.nextLine());
			BigInteger answer =new BigInteger("0");//判斷答案用
			String str="1";
			int count=2;
			BigInteger a =new BigInteger(str);
			BigInteger b3=a.divide(b); //b3=運算用
			b3=a.subtract(b3.multiply(b)); 
			while (!b3.equals(answer)) {
				str=str+count;
				//System.out.println(str);
				a =new BigInteger(str);
				b3=a.divide(b); 
				b3=a.subtract(b3.multiply(b)); 
				count++;
			}
			System.out.println(count-1);
		}

	}

}
