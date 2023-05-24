import java.util.Scanner;

public class Main {
	    public static void main(String args[]){    
	    	Scanner sc = new Scanner(System.in);
	    		
	    		int result = 0;
	    		String st = sc.nextLine();
	    		String sp[] = st.split(" ");
	    		for(int i = 0; i<5; i++)
	    		{
	    			int n =Integer.parseInt(sp[i]);
	    			result += n*n ;
	    		}
	    	System.out.println(result%10);
	}
}