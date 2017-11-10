import java.util.Scanner;

public class CMM46 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int rundex = Integer.parseInt(cin.nextLine());
		for(int i =1;i<=rundex;i++)
		{
			String [] str = cin.nextLine().split(" ");
			String c = str[0];
			int [] x = new int[]{Integer.parseInt(str[1]),Integer.parseInt(str[2])};
			int [] y = new int[]{Integer.parseInt(str[3]),Integer.parseInt(str[4])};
			int [] z=new int[2];
			if(c.equals("+")){
				z[0] = x[0] + y[0];
	            z[1] = x[1] + y[1];
			}
			
			if(c.equals("-")){
				z[0] = x[0] - y[0];
	            z[1] = x[1] - y[1];
			}
			if(c.equals("*")){
				z[0] = 0;
                z[0] += x[0] * y[0];
                z[0] -= x[1] * y[1];
	            
	            z[1] = 0;
                z[1] += x[0] * y[1];
                z[1] += x[1] * y[0];
			}
			System.out.println(z[0]+" "+z[1]);
		}
	}

}
