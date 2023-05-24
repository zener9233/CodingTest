import java.util.Arrays;
import java.util.Scanner;

public class  Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1[] = new int[9];
		int num2[] = new int[9];
		int count = 1;
		for(int i = 0; i<9; i++)
		{
			num1[i] = sc.nextInt();			
			num2[i] = num1[i];
		}
		Arrays.sort(num1);
		for(int i =0; i<9; i++)
		{
			if(num1[8]==num2[i])
				break;
			
			count++;
		}
		System.out.println(num1[8]);
		System.out.println(count);
	}

}