import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		int n = 0;
		n = sc.nextInt();
		int yaksu[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			yaksu[i] = sc.nextInt();
		}
		int result = 0;
		Arrays.sort(yaksu);
		result = yaksu[0]*yaksu[n-1];
		System.out.println(result);
	}

}
