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
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i<t; i++)
        {
        	String st = br.readLine();
        	int count = 0;
        	for(int j = 0; j<st.length(); j++)
        	{
        		if(st.charAt(j) == '(')
        			count++;
        		else
        			count--;
        		
        		if(count<0)
        			break;
        	}
        	if(count == 0)
        		System.out.println("YES");
        	else
        		System.out.println("NO");
        }
	}
}
