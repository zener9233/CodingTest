import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m[] = new int[n];
		for(int i = 0; i<n; i++)
		{
			m[i] = sc.nextInt();
		}
		int count = 0;
		for(int i = 0; i<n; i++)
		{
			if(m[i]<=4)
			{
				if(m[i] == 4)
				{
					
				}
				else if(m[i] == 2||m[i] == 3)
				{
					count++;
				}
				else {
					
				}
			}
			else 
			{
				int count2 = 0;
				for(int j = 2; j*j<=m[i]; j++)
				{
					 if(m[i]%j == 0)
					 {
						 count2++;
					 }
				}
				if(count2==0)
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}

}