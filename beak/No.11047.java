import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		int ra[] = new int[n];
		int count = 0;
		for(int i= 0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i = 0; i<n; i++)
		{
			ra[i] = a[n-1-i];
		}
		for(int i =0; i<n; i++)
		{
				count += k/ra[i];
				k = k%ra[i];
				if(k == 0)
				{
					break;
				}
		}
		System.out.println(count);
	}

}