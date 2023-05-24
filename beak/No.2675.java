import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r[] = new int[n];
		String s[] = new String[n];
		for(int i =0; i<n; i++)
		{
			r[i] = sc.nextInt();
			s[i] = sc.next();
		}
		for(int k =0; k<n; k++) {
		for(int i = 0; i<s[k].length(); i++)
		{
			for(int j = 0; j<r[k]; j++)
			{
				System.out.print(s[k].charAt(i));
			}
		}
		System.out.println();
		}
		
	}

}