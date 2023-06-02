import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] m = new int[n][2];
        for(int i = 0; i<n; i++)
        {
        	String st[] = br.readLine().split(" ");
        	for(int j = 0; j<2; j++)
        	{
        		m[i][j] = Integer.parseInt(st[j]);
        	}
        }
        Arrays.sort(m, new Comparator<int[]>() {
        	@Override
        	public int compare(int []o1, int []o2) {
        		return o1[1] !=o2[1] ? o1[1]-o2[1] : o1[0]-o2[0];
        	}
        });
        for(int i = 0; i<n; i++)
        {
        	bw.write(m[i][0]+" "+m[i][1]+""+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
	}

}
