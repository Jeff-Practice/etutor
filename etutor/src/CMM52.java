import java.util.Scanner;

public class CMM52 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int hr = cin.nextInt();//x
			int endhr = cin.nextInt();//y
			for(int i =hr;i<endhr+1; i++)
			{
				for(int j = 0; j<60; j++)
				{
					double h = (i%12)*30;
					h=j*0.5;
					double a = j*6;//m
					double angle = Math.abs(h-a);
					if(angle>180) angle=360-angle;
					if (angle >= 88 && angle <= 92)
					{
						if(i<10)System.out.print("0" +i);
						else System.out.print(i);
						if(j<10)System.out.print(":0" + j);
						else System.out.print(":" +j);
						System.out.println("degree=" + angle);
					}
					if(i==endhr)break;
						
							
				}
			}
			
		}

	}

}
