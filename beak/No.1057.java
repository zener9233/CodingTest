import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j = sc.nextInt();
		int h = sc.nextInt();
		int match[] = new int[n];
		int count = 0;
		for(int i = 0; i<n; i++)
		{
			match[i] = i+1;
		}
		while(true)
		{
			for(int i = 0; i<n; i++) 
			{
			if(match[i]%2 != 0)
			{
			match[i] = match[i]+1;
			}
			}
			for(int i = 0; i<n; i++) 
			{
				match[i] = match[i]/2;
			}
			count++;
			if(match[j-1] == match[h-1])
				break;
		}
		System.out.println(count);
	}

}