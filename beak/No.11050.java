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
        String st[] = br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int k = Integer.parseInt(st[1]);
        br.close();
        int num1 = 1;
        for(int i = 1; i<=n; i++)
        {
        	num1 *=i;
        }
        for(int i = 1; i<=k; i++)
        {
        	num1 /=i;
        }
        for(int i = 1; i<=n-k; i++)
        {
        	num1 /=i;
        }
        bw.write(num1+"");
        bw.flush();
        bw.close();
	}

}
