import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n[] = new int[5];
		int count = 0;
		int num = 1;
		for(int i = 0; i<5; i++)
		{
			n[i] = sc.nextInt();
		}
		while(count<3)
		{
			count = 0;
			num++;
			if(num%n[0] == 0)
				count++;
			if(num%n[1] == 0)
				count++;
			if(num%n[2] == 0)
				count++;
			if(num%n[3] == 0)
				count++;
			if(num%n[4] == 0)
				count++;
			
		}
		System.out.println(num);
	}

}
