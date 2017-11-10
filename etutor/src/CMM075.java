import java.util.Scanner;

public class CMM075 {

	public static void main(String[] args) {
		Scanner cin =new Scanner(System.in);
		while (cin.hasNext()) {
			int much = cin.nextInt();
			int price = cin.nextInt();
			int fivehun =cin.nextInt();
			int hun = cin.nextInt();
			int fifty = cin.nextInt();
			int ten = cin.nextInt();
			int five =cin.nextInt();
			int one = cin.nextInt();
			int coin =0;
			int takeback = 1000 - much*price;
			//500
			if(takeback/500>fivehun){
				takeback = takeback-(fivehun*500);
				coin += fivehun;
			}
			else {
				coin = coin+(takeback/500);
				takeback = takeback-(takeback/500)*500;
			}
			//100
			if(takeback/100>hun){
				takeback = takeback-(hun*100);
				coin += hun;
			}
			else {
				coin = coin+(takeback/100);
				takeback = takeback-(takeback/100)*100;
			}
			//50
			if(takeback/50>fifty){
				takeback = takeback-(fifty*50);
				coin += fifty;
			}
			else {
				coin = coin+(takeback/50);
				takeback = takeback-(takeback/50)*50;
			}
			//10
			if(takeback/10>ten){
				takeback = takeback-(ten*10);
				coin += ten;
			}
			else {
				coin = coin+(takeback/10);
				takeback = takeback-(takeback/10)*10;
			}
			//5
			if(takeback/5>five){
				takeback = takeback-(five*5);
				coin += five;
			}
			else {
				coin = coin+(takeback/5);
				takeback = takeback-(takeback/5)*5;
			}
			coin = coin +takeback;
			System.out.println(coin);
		}
		

	}

}
