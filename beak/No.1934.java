import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc= new Scanner(System.in);
			int n = sc.nextInt();
			
			int num[][] = new int[n][2];
			for(int i = 0; i<n; i++)
			{
				for(int j =0; j<2; j++)
				{
					num[i][j] = sc.nextInt();
				}
			}
			
			for(int i = 0; i<n; i++)
			{		
				
				if(num[i][0] == 1 || num[i][1] == 1)
				{
					System.out.println(num[i][0]*num[i][1]);
				
				}
				else 
				{
					 int min = 0;
					while(true) {
						min++;
						int result = (num[i][0]*min)%num[i][1];
						if(result == 0)
						{
							System.out.println(num[i][0]*min);
							break;
						}
					}
				}
				
				}
			}
	}
