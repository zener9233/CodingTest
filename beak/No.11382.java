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
        Long sum = (long)0;
        for(int i = 0; i<3; i++)
        {
        	sum+=Long.parseLong(st[i]);
        }
        bw.write(sum+"");
        bw.flush();
        br.close();
        bw.close();

	}
}