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
        String st[] = br.readLine().split("");
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i<st.length/2; i++)
        {
        	sum1+=Integer.parseInt(st[i]);
        }
        for(int i = st.length/2; i<st.length; i++)
        {
        	sum2+=Integer.parseInt(st[i]);
        }
        
        if(sum1 == sum2)
        {
        	bw.write("LUCKY");
        }
        else
        {
        	bw.write("READY");
        }
        br.close();
        bw.flush();
        bw.close();
	}
}
