import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		n = n - n%100;
		while(true)
		{
			
			if(n%m == 0)
			{
				
				if(n%100 <10) {
					System.out.println("0"+n%100);
				}
				else {
				System.out.println(n%100);
				}
				break;
			}
			n++;
		}
	}

}
