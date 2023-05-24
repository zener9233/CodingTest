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
        for(int i = 0; i< t; i++)
        {
        	String st[] = br.readLine().split(" ");
        	int dong = 0;
        	int floor = 1;
        	int n = Integer.parseInt((st[2]));
        	for(int j = 0; j<n; j++)
        	{
        		if(dong == Integer.parseInt(st[0]))
        		{
        			dong = 0;
        			floor++;
        		}        			dong++;
        		
        	}
        	
        	if(floor > 9)
        	{
        		bw.write(dong+""+floor+"\n");
        	}
        	else
        	{
        		bw.write(dong+"0"+floor+"\n");
        	}
        	
        	
        	
        }
        bw.close();
	}

}