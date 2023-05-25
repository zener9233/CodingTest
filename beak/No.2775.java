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
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i<t; i++) {
        	int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int human[][] = new int[k+1][n+1];
            for(int j = 0; j<=n; j++)
            {
            	human[0][j] = 1+j;
            }
            for(int j = 0; j<=k; j++)
            {
            	human[j][0] = 1;
            }
            for(int j = 1; j<=k; j++)
            {
            	for(int l = 1; l<=n; l++)
            	{
            		human[j][l] = human[j-1][l]+human[j][l-1];
            	}
            }
            bw.write(human[k][n-1]+""+"\n");
        }
        bw.close();
	}
}