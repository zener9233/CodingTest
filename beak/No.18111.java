import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<Integer>set = new HashSet<>();
        String st[] = br.readLine().split(" ");
        int y = Integer.parseInt(st[0]);
        int x = Integer.parseInt(st[1]);
        
        int n[][] =new int[y][x];
        for(int i = 0; i<y; i++)
        {
        	String sl[] = br.readLine().split(" ");
        	for(int j = 0; j<x; j++)
        	{
        		n[i][j] = Integer.parseInt(sl[j]);
        		set.add(n[i][j]);
        	}
        }
        int max = Collections.max(set);
        int time[][] = new int [max+1][2];
        for(int k = max; k >=0; k--) {
        	int timer = 0;
        	int block = Integer.parseInt(st[2]);
        for(int i = 0; i<y; i++)
        {
        	for(int j = 0; j<x; j++)
        	{
        		if(n[i][j] == max)
        		{
        		
        		}
        		else 
        			{
        			if(n[i][j]>max)
        		{
        			timer += (n[i][j]-max)*2;
        			block += (n[i][j]-max);
        		}
        		else if(n[i][j]<max)
        		{
        			timer += (max-n[i][j]);
        			block -= (max-n[i][j]);
        			
        		}
        	}
        	}
        }
        if(block>=0) {
       time[k][0] = timer;
       time[k][1] = max;
        }
        else
        {
        	time[k][0] = 999999999;
            time[k][1] = 999999999;
        }
        max--;
        }
        Arrays.sort(time,new Comparator<int[]>() {
        	@Override
        	public int compare(int[]o1, int[]o2) {
        		return o1[0]!=o2[0]?o1[0]-o2[0]:o2[1]-o1[1];
        	}
        });
       bw.write(time[0][0]+" "+time[0][1]+"");
        br.close();
        bw.flush();
        bw.close();
	}
}
