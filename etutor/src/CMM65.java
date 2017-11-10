import java.util.Scanner;

public class CMM65 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String [] str= cin.nextLine().split(",");
			int money = Integer.parseInt(str[0]);
			int appale = Integer.parseInt(str[1]);
			int orange = Integer.parseInt(str[2]);
			int peach = Integer.parseInt(str[3]);
			int one=0,five = 0 , fifty = 0 ,paymoney;
			paymoney = appale*15 + orange*20 + peach*30;
			int takeback;
			if(money<paymoney)System.out.println("0");
			else {
				takeback=money-paymoney;
				fifty = takeback/50;
				takeback = takeback%50;
				five = takeback/5;
				one= takeback%5;
				System.out.println(one + ","+five + "," + fifty );
			}
		}

	}

}
