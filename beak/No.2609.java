import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int min = 0;
		int max = 0;
		if(m>n)
		{
			max = n;
			while(true)
			{
				if(n%max == 0 && m%max == 0)
				{
					System.out.println(max);
					System.out.println((n*m)/max);
					break;
				}
				max--;
			}
		}
		else if(n>m)
		{
			max = m;
			while(true)
			{
				if(n%max == 0 && m%max == 0)
				{
					System.out.println(max);
					System.out.println((n*m)/max);
					break;
				}
				max--;
			}
		}
		else
		{
			System.out.println(m);
			System.out.println(m);
		}
		
	}

}
