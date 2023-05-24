import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		char b[] = {'0','1','2','3','4','5','6','7','8','9'};
		
		int num = 1;
		for(int i : a)
		{
			a[i] = sc.nextInt();
			num *= a[i];
		}
		int count = (int) Math.log10(num)+1;
		String num1 = String.valueOf(num);
		for(int j =0; j<10; j++)
		{
			int count1 = 0;
		for(int i = 0; i<count; i++)
		{
		if(b[j] == num1.charAt(i))
			count1++;
		}
		System.out.println(count1);
		}
		
	}

}