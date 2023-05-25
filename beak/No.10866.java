import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Deque<String> dq = new LinkedList<>();
        
        for(int i = 0; i<n; i++)
        {
        	String st[] = br.readLine().split(" ");
        	if(st[0].equals("push_front"))
        	{
        		dq.addFirst(st[1]);

        	}
        	else if(st[0].equals("push_back"))
        	{
        		dq.addLast(st[1]);
        	}
        	else if(st[0].equals("pop_front"))
        	{
        		if(dq.size()== 0)
        		{
        			bw.write("-1"+"\n");
        		}
        		else
        		{
        			bw.write(dq.poll()+"\n");
        		}
        	}
        	else if(st[0].equals("pop_back"))
        	{
        		if(dq.size()== 0)
        		{
        			bw.write("-1"+"\n");
        		}
        		else
        		{
        			bw.write(dq.pollLast()+"\n");
        		}
        	}
        	else if(st[0].equals("size"))
        	{
        		bw.write(dq.size()+"\n");
        	}
        	else if(st[0].equals("empty"))
        	{
        		if(dq.size() == 0)
        		{
        			bw.write("1"+"\n");
        		}
        		else
        		{
        			bw.write("0"+"\n");
        		}
        	}
        	else if(st[0].equals("front"))
        	{
        		if(dq.size() == 0)
        		{
        			bw.write("-1"+"\n");
        		}
        		else
        		{
        			bw.write(dq.peek()+"\n");
        		}
        	}
        	else if(st[0].equals("back"))
        	{
        		if(dq.size() == 0)
        		{
        			bw.write("-1"+"\n");
        		}
        		else
        		{
        			bw.write(dq.peekLast()+"\n");
        		}
        	}
        }
        br.close();
        bw.flush();
        bw.close();
	}
	
}
