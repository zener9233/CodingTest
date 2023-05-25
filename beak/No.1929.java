import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String st[] = br.readLine().split(" ");
		int n = Integer.parseInt(st[0]);
		int m = Integer.parseInt(st[1]);
		for(int i =n; i<=m; i++)
		{
			if(i<5)
			{
				if(i == 4)
				{
					
				}
				else if(i==2||i==3)
				{
					System.out.println(i);
				}
				else {
					
				}
			}
			else
			{	int count = 0;
				for(int j = 2; j*j<=i; j++)
				{
					
					if(i%j == 0)
					{
						count++;
					}
				}
				if(count == 0)
					System.out.println(i);
			}
			
			
		}
	}
}