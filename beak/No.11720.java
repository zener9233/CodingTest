import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String st = bf.readLine();
		int result = 0;
		String token[] = st.split("");
		for(int i =0; i<n; i++)
		{
		  result +=Integer.parseInt(token[i]);
		}
		System.out.println(result);
	}

}
