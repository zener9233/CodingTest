import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long suck = sc.nextInt()-1;
		long result = 0;
		long answer = 0;
		
		 result = suck/6;
		 if(suck%6 > 0)
		 {
			 result+=1;
		 }
		 int i = 0;
		 while(true)
		 {			
			 i++;
			 if(answer >= result)
			 {
			 break;			
			 }
				 answer += i;
		 }
		 System.out.println(i);
	}

}