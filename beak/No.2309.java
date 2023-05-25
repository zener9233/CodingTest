import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int [] key = new int[9];
		int sum = 0;
		
		for(int i = 0; i<9; i++)
		{
			key[i] = sc.nextInt();	
			sum += key[i];	
		}

		int result = sum-100;
		for(int i = 0; i<9; i++)
		{
			for(int j = i+1; j<9; j++)
			{
				if(key[i]+key[j] == result)
				{
					key[i] = 100000;
					key[j] = 100000;
				}
			}
			if(key[i] == 100000)
			{break;}
		}
		Arrays.sort(key);
		for(int i = 0; i<7; i++)
		{
			System.out.println(key[i]);
		}
			}
		}