import java.util.Scanner;

public class CMM36 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			if(a>2 && a<6)System.out.println("Spring");
			else if(a>5 && a<9)System.out.println("Summer");
			else if(a>8 && a<12)System.out.println("Autumn");
			else System.out.println("Winter");
		}

	}

}
