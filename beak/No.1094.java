import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int X = sc.nextInt();
			int Y[] = {64, 32, 16, 8, 4, 2, 1} ;			
			int result = X;
			int count = 0;
			 for(int i =0; i<64; i++)
			 {
				 if(result >= Y[i])
				 {
					 result -= Y[i];
					 count++;
				 }
				 if(result == 0)
					 break;
		     }
			 System.out.println(count);
	}

}