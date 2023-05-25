import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		String st[] = br.readLine().split(" ");
		for(int i = 0; i<n; i++)
		{
			a[i] = Integer.parseInt(st[i]);
		}
		Arrays.sort(a);
		int m = Integer.parseInt(br.readLine());
		String st2[] = br.readLine().split(" ");
		for(int i = 0; i<m; i++)
		{
			int count = 0;
			int solv = Integer.parseInt(st2[i]);
			if(solv>=a[n/2])
			{
				for(int j = n/2; j<n; j++)
				{
					if(solv == a[j])
					{
						count++;
						break;
					}
				}
			}
			else
			{
				for(int j = 0; j<n/2; j++)
				{
					if(solv == a[j])
					{
						count++;
						break;
					}
				}
			}
			if(count>0)
			{
				bw.write("1"+"\n");
			}
			else {
				bw.write("0"+"\n");
			}
		}
		bw.close();
	}
}