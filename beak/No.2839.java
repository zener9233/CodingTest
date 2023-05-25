import java.util.Scanner;

class  Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 0;
		int num3 = 0;
		int num5 =0;
		int result = 0;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		
		num5 = N/5;
		num3 = (N%5)/3;
		
		
		if(N%5 == 1) {
			num5 = num5 -1;
			num3 += 2;
		}
		else if(N%5 == 2) {
			num5 = num5 - 2;
			num3 += 4;
		}
		else if(N%5 == 4) {
			num5 = num5 -1;
			num3 += 2;
		}
		result = num3 + num5;
		
		if(num5 <0)
		{
			result = -1;
		}
		System.out.println(result);
	
	}

		
		
	}
