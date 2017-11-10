import java.text.NumberFormat;
import java.util.Scanner;

public class CROU08 {
	static double sum;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMinimumFractionDigits(2);
		nf.setGroupingUsed(false);
			while(cin.hasNext())
			{
				sum=0;
				double index = cin.nextDouble();
				sumheight(index/2);
				sum=(sum*2) +index;
				System.out.println(nf.format(((double)Math.round(sum*100))/100));
				
			}
		


	}
	public static void sumheight(double index)
	{	
		if(index<1){
			return;
		}
		else if (index==1)
		{
			sum+=1;
		}
		else{
			sum+=index;
			sumheight(index/2);
		}
	}

}
