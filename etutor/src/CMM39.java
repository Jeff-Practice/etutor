import java.util.Arrays;
import java.util.Scanner;

public class CMM39 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String [] str = cin.nextLine().split(" ");
			int [] number = new int[3];
			boolean flag;
			for(int i=0; i<3; i++)
			{
				number[i] = Integer.parseInt(str[i]);
			}
			Arrays.sort(number);
			if(number[2]<number[1]+number[0]) flag=true;
			else flag=false;
			if(flag){
				if(Math.pow(number[2], 2)==Math.pow(number[1], 2)+ Math.pow(number[0], 2))System.out.println("Right Triangle");
				else if(Math.pow(number[2], 2)>Math.pow(number[1], 2)+ Math.pow(number[0], 2)) System.out.println("Obtuse Triangle");
				else System.out.println("Acute Triangle");
			}
			else System.out.println("Not Triangle");
			
		}

	}

}
