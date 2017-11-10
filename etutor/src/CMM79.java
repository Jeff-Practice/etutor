import java.util.Arrays;
import java.util.Scanner;

public class CMM79 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int rundex =cin.nextInt();
			for(int i =1; i<= rundex; i++)
			{
				int [] tri = new int [3];
				tri[0] = cin.nextInt();
				tri[1] = cin.nextInt();
				tri[2] = cin.nextInt();
				Arrays.sort(tri);
				if(tri[0]+tri[1]>tri[2])
				{
					int s = (tri[0]+tri[1]+tri[2]);
					double x = Math.sqrt((s*(s-tri[0])*(s-tri[1])*(s-tri[2])))/2;
				}
				else {
					System.out.println("0 0 0 0");
				}
			}
			
		}

	}

}
