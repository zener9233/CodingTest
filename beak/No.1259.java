import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = 1;
		while(n != 0)
		{
			n =Integer.parseInt(br.readLine());
			int sure = 0;
			String num = Integer.toString(n);
			for(int i = 0; i<num.length()/2; i++)
			{
				if(num.charAt(i) != num.charAt((num.length()-1)-i))
				{
					sure++;
				}			
			}
			if(n == 0)
			{
			}
			else {
			if(sure > 0)
			{
				System.out.println("no");
			}
			else if(sure == 0) {
				System.out.println("yes");
			}
			}
		}
	}
}
