import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = 0;
		int a = 0;
		int b = 0;
		int c = 1;
		int d = 0;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		
		for(int i = 0; i < T; i++)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			for(int j = 0; j <b; j++)
			{
				c *=  a;
				d = c%10;	
				c = d;
				if(d == 0)
				{
					d = 10;
					break;
				}
			}
			System.out.println(d);
			c = 1;
		}
	}

}