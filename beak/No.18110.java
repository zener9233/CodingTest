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
        int num[] = new int [n];
        
        for(int i = 0; i<n; i++)
        {
        	num[i]= Integer.parseInt(br.readLine());
        }
        Arrays.sort(num);
        double m = Math.round((double)n*0.15);
        int sum = 0;
        int count = 0;
        for(int i = (int) m; i<n-m; i++)
        {
        	sum+=num[i];
        	count++;
        }
        bw.write(Math.round((double)sum/count)+"");
        bw.flush();
        br.close();
        bw.close();
	}
}