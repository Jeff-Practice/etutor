import java.util.Scanner;

public class CMM37 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			double x = cin.nextDouble();
			double y = cin.nextDouble();
			if(x==0) System.out.println("y-axis");
			else if(y==0) System.out.println("x-axis");
			else if(x>0 && y>0)System.out.println("1st Quadrant");
			else if(x<0 && y>0)System.out.println("2nd Quadrant");
			else if(x<0 && y<0)System.out.println("3rd Quadrant");
			else if(x>0 && y<0)System.out.println("4th Quadrant");
		}

	}

}
