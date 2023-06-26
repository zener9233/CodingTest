import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;

	public class Main{

		public static void main(String[] args) throws IOException{
	        // TODO Auto-generated method stub
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	       int n = 2541-1998;
	       int m = Integer.parseInt(br.readLine());
	       int y = m-n;
	       bw.write(y+"");
	       bw.close();
	       br.close();
		}
	}