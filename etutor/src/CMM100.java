import java.util.Scanner;

public class CMM100 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int S,K,M,D,T;
			S=cin.nextInt();
			K=cin.nextInt();
			M=cin.nextInt();
			D=cin.nextInt();
			T=S;
			if(M>=D)T+=D*K;
			else {
				T+= (D-M)*(K+5) +M*K;
			}
			System.out.println(T);
		}

	}

}
