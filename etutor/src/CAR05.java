import java.util.Scanner;

public class CAR05 {

	public static void main(String[] args) { 
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			int rundex = cin.nextInt();
			int[] timdex = new int[25];
			for(int i=0;i<rundex;i++){
				int start = cin.nextInt();
				int end = cin.nextInt();
					for(int j=start;j<end;j++){
						timdex[j]++;
					}
			}
        int count =0;
        for(int i=0;i<25;i++){
            count = Math.max(count, timdex[i]);
        }
        System.out.println(count);
    }
	}

}
