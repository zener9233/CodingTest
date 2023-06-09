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
        int num[][] = new int[n][2];
        for(int i = 0; i<n; i++)
        {
        	String st[] = br.readLine().split(" ");
        	for(int j = 0; j<2; j++)
        	{	
        		num[i][j] = Integer.parseInt(st[j]);
        	}
        }
        br.close();
        Arrays.sort(num, new Comparator<int[]>() {
        	@Override
        	public int compare(int[]o1, int[]o2) {
        		return o1[0]!=o2[0]?o1[0]-o2[0] : o1[1]-o2[1];
        	}
        });
        
        for(int i = 0; i<n; i++)
        {
        		bw.write(num[i][0]+" "+num[i][1]+""+"\n");
        }
        bw.flush();
        bw.close();
	}

}