import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m[][] = new int[n][2];
		for(int i = 0; i<n; i++)
		{
			for(int j =0; j<2; j++)
			{
				m[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i<n; i++)
		{
			
			System.out.println(m[i][0]+m[i][1]);
	
		}
	}
}