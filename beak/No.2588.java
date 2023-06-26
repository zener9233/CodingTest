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
        String st1 =br.readLine();
        int m = Integer.parseInt(st1);
        String st[] = st1.split("");
        for(int i = 0; i<3; i++) {
        bw.write(n*Integer.parseInt(st[2-i])+""+"\n");
        }
        bw.write(n*m+"");
        bw.flush();
        br.close();
        bw.close();

	}
}