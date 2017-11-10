import java.util.Scanner;

public class CMM72 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
			int runindex = cin.nextInt();
			for(int i = 1; i<=runindex; i++)
			{
				int people = cin.nextInt();
				int count = people;
				boolean [] peotr =new boolean[people];
				int out =cin.nextInt();
				for (int j = 0; j < people; j++) {
					peotr[j]=true;
				}
				int abc =0,index =-1;
				while(count!=1)
				{
					index++;
					if(peotr[index])
					{	
						abc++;
						if(abc==out)
						{
							peotr[index]=false;
							count--;
							abc =0;
							//System.out.println(index+1 +  "out");
						}
					}
					if(index==people-1) index=-1;
					
				}
				for(int j=0; j<people; j++)
				{
					if(peotr[j])System.out.println(j+1);
				}
			}

	}

}
