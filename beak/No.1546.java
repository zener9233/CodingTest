import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double y[] = new double[n];
		double sum = 0;
		
		for(int i =0; i<n; i++) {
			y[i] = sc.nextInt();
		}
		Arrays.sort(y);
		double max = y[n-1];
		for(int i =0; i<n; i++)
		{
			y[i] = y[i]/max*100;			
		}
		for(int i =0; i<n; i++)
		{
			sum+=y[i];
		}
		System.out.println(sum/n);
		
		
	}

}