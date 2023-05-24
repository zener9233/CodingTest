import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int num[] = new int[n];
		int renum[] = new int[n];
		int result = 0;
		for(int i = 0; i<n; i++)
		{
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		for(int i = 0; i<n; i++)
		{
			renum[i] = num[n-1-i];
		}
		for(int i =0; i<n; i++){
		for(int j =i+1; j<n; j++){
		for(int k=j+1; k<n; k++){
		int sum = renum[i]+renum[j]+renum[k];
		if (sum <= m && m - sum < m - result) 
		 {
				 result = sum;
		 }
		}
		}			
	}
			System.out.println(result);
	}
}