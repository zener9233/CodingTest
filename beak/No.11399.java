import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int person = 0;
		Scanner sc = new Scanner(System.in);
		
		//대기중인 사람 수
		person = sc.nextInt();
		
		int a[] = new int[person];
		for(int i = 0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		int sum = 0;
		int time = 0;
		Arrays.sort(a);
		
		for(int i =0; i<person; i++) {
			
			sum = sum+a[i];
			time +=sum;
		}
		System.out.println(time);
		
	}

	
}