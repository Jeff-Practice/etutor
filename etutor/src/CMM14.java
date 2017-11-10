import java.util.Scanner;

public class CMM14 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int time = cin.nextInt();
			int day=0,hour=0,min=0,sec=0;
			
			System.out.println(time/86400 + " days");
			System.out.println(time/3600%24 + " hours");
			System.out.println(time/60%60 + " minutes");
			System.out.println(time%60 + " seconds");
		}

	}

}
