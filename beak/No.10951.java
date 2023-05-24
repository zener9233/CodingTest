import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String num = "";
		
		StringTokenizer st;
		
		while((num = bf.readLine()) !=  null) {
			st = new StringTokenizer(num);
			int result = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
			System.out.println(result);
		}
	}

}