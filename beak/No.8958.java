import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String st[] = new String[n];
		
		for(int i =0; i<n; i++)
		{
			st[i] = sc.next();
		}
		for(int i = 0; i<n; i++)
		{
			int count = 0;
			int result = 0;
			for(int j =0; j<st[i].length(); j++)
			{
				
				if(st[i].charAt(j) == 'O')
				{
					count++;
                    result += count;
				}
				else if(st[i].charAt(j) == 'X')
				{
					count = 0;
                    result += count;
				}
				
			}
			System.out.println(result);
		}
	}

}