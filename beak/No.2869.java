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
        int A = Integer.parseInt(st[0]);
        int B = Integer.parseInt(st[1]);
        int V = Integer.parseInt(st[2]);
        
        if((V-B)%(A-B) == 0 ) {
        bw.write((V-B)/(A-B)+"");
        }
        else
        {
        	bw.write((V-B)/(A-B)+1+"");

        }
        bw.flush();
        bw.close();
	}

}