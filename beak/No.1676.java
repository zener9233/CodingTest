import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int five = 0;
        for(int i = 1; i<n+1; i++)
        {
        	if(i%5 == 0)
        	{
        		five++;
        	}
        	if(i%25 == 0)
        	{
        		five++;
        	}
        	if(i%125 == 0)
        	{
        		five++;
        	}
        	
        }
        bw.write(five+"");
       
        
        bw.flush();
        br.close();
        bw.close();
        
	}
}
