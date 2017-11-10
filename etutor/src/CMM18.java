import java.util.Scanner;

public class CMM18 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int i = cin.nextInt();
			String str;
			if(i>0){
				str = Integer.toBinaryString(i);
				for(int index =str.length(); index<8; index++)
				{
					str="0" + str;
				}
			}
			else {
				str = Integer.toBinaryString(i);
				int len = str.length();
				str = str.substring(len-8,len);
			}
			
			System.out.println(str);
			
		}
		
		

	}

}
