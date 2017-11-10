import java.util.Scanner;

public class CMM81 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String str =cin.nextLine();
			if (str.length()>=2)
			{
				if(str.substring(0, 2).equals("0x"))
				{
					//System.out.println("test");
					str = str.substring(2,str.length());
					System.out.println(Integer.parseInt( str, 16 ));
				}
				else {
					str = Integer.toHexString(+Integer.parseInt(str));
					System.out.println("0x" + str.toUpperCase());//Integer.toHexString(Integer.parseInt(str))
				}
			}
			
			else {
				str = Integer.toHexString(+Integer.parseInt(str));
				System.out.println("0x" + str.toUpperCase());//Integer.parseInt(str
			}
		}

	}

}
