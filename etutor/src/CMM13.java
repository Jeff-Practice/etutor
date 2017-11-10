import java.util.Scanner;

public class CMM13 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int starthr = cin.nextInt();
			int startmin = cin.nextInt();
			int endhr = cin.nextInt();
			int endmin =cin.nextInt();
			int totaltime,paymoney=0;
			totaltime =(endhr*60 + endmin) - (starthr*60+startmin);
			if(totaltime<120)
			{
				paymoney =(totaltime/30)*30;
			}
			else if (totaltime<=240){
				 paymoney = 4*30;
				 paymoney = paymoney + ((totaltime-120)/30)*40;
			}
			else {
				paymoney = 4*30;//2hr
				paymoney = paymoney +4*40;//4hr
				paymoney = paymoney + ((totaltime-240)/30)*60;//>4hr
			}
				
			
			
			System.out.println(paymoney);
		}

	}

}
