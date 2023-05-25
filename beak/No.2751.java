import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		int m[] = new int[n];
		for(int i =0; i<m.length; i++)
		{
			m[i] = Integer.parseInt(bf.readLine());
		}
		Arrays.sort(m);
		for(int i =0; i<m.length; i++)
		{
			bw.write(m[i]+"\n");
		}
		bw.flush();
	}
}