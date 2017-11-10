import java.util.Scanner;

public class CMM58 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String [] str = cin.nextLine().split(",");			
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int c = Integer.parseInt(str[2]);
			//ax+by=c
			for(int x=0; x<=c; x++)
			{
				for(int y = 0; y<=c;y++)
				{
					if(a*x + b*y ==c)System.out.println(x+","+y);
				}
			}
			
		}

	}

}
