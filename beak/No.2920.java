import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1[] = new int[8];
		int num2[] = {1,2,3,4,5,6,7,8};
		int num3[] = {8,7,6,5,4,3,2,1};
 		for(int i =0; i<8; i++)
		{
			num1[i] = sc.nextInt();
		}
 		if(num1[0] == 1)
 		{
 			int count = 0;
 			for(int i = 0; i<8; i++)
 			{
 				if(num1[i] == num2[i])
 				{
 					count++;
 				}
 			}
 			if(count == 8)
 			{
 				System.out.println("ascending");
 			}
 			else {
 				System.out.println("mixed");
 			}
 		}
 		else {
 			int count = 0;
 			for(int i = 0; i<8; i++)
 			{
 				if(num1[i] == num3[i])
 				{
 					count++;
 				}
 			}
 			if(count == 8)
 			{
 				System.out.println("descending");
 			}
 			else {
 				System.out.println("mixed");
 			}
 		}
	}

}