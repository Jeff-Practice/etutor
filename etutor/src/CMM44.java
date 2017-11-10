import java.util.Scanner;

public class CMM44 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String a = cin.next();
			String b = cin.next();
			int sum=0;
			int i=0;
			while (i<b.length()) {
				if(!(b.indexOf(a,i)<0)){
					sum++;
					i=b.indexOf(a,i);
				}
				i++;
			}
			System.out.println(sum);
			
		}

	}

}
