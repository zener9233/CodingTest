import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int m[] = new int[n];
		for(int i = 0; i<n; i++)
		{
			m[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(m);
		for(int i = 0; i<n; i++)
		{
			bw.write(m[i]+"\n");
		}
		bw.close();
	}

}
