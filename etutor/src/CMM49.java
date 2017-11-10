import java.util.Scanner; 
public class CMM49{ 
	public static void main(String[]args) 
	{ 
		Scanner input = new Scanner(System.in); 
		int n = input.nextInt(); 
		for (int i = 0; i < n; i++) 
		{ 
			int m = input.nextInt(); 
			int j = 1; 
			int k = 1; 
			for (; (j %= m) != 0; k++) 
			j = 10 * j + 1; 
			System.out.println(k); 
		} 
	} 
} 