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
        String st[] = br.readLine().split(" ");
        int k = Integer.parseInt(st[0]);
        int n = Integer.parseInt(st[1]);
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < k; i++)
        {
        	q.add(i+1);
        }
        bw.write("<");
        for(int i = 0; i<k; i++)
        {
        	for(int j = 0; j<n-1; j++)
        	{
        	q.add(q.poll());
        	}
        	bw.write(q.poll()+"");
        	if(i<k-1)
        		bw.write(", ");
        	
        }
        bw.write(">");
        bw.flush();
        bw.close();
	}

}
