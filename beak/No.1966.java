import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<int[]> q = new LinkedList<>();
        
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++)
        {
        	String st1[]= br.readLine().split(" ");
        	String st2[] =br.readLine().split(" ");
        	int count = 0;
        	for(int j = 0; j<Integer.parseInt(st1[0]); j++)
        	{
        		q.add(new int[] {j,Integer.parseInt(st2[j])});
        	}
        	while (true) {
				int w[] = q.remove();
				boolean tf = true;
				
				for (int q1[] : q) {
					if(q1[1] > w[1]) {
						tf = false;
						break;
					}
				}
				
				if(tf) {
					count++;
					if(w[0] == Integer.parseInt(st1[1])) break;
				}else {
					q.add(w);
				}
			}
        	bw.write(count+""+"\n");
        	q.clear();
        }
        br.close();
        bw.flush();
        bw.close();
	}

}