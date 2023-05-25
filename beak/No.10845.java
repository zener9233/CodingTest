import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<String> q = new LinkedList<>();
		int n =Integer.parseInt(br.readLine());
		int last = 0;
		for(int i = 0; i<n; i++) {
			String st[] = br.readLine().split(" ");
			if(st[0].equals("push"))
			{
				q.add(st[1]);
				last = Integer.parseInt(st[1]);
			}
			else if(st[0].equals("pop"))
			{
				if(q.isEmpty())
				{
					bw.write("-1"+"\n");
				}
				else
				{
					bw.write(q.poll()+"\n");
				}
			}
			else if(st[0].equals("size") )
			{
				bw.write(q.size()+""+"\n");
			}
			else if(st[0].equals("empty"))
			{
				if(q.isEmpty())
				{
					bw.write("1"+"\n");
				}
				else {
					bw.write("0"+"\n");
				}
			}
			else if(st[0].equals("front"))
			{
				if(q.isEmpty())
				{
					bw.write("-1"+"\n");
				}
				else {
					bw.write(q.peek()+"\n");
				}
			}
			else if(st[0].equals("back"))
			{
				if(q.isEmpty())
				{
					bw.write("-1"+"\n");
				}
				else {
					bw.write(last+""+"\n");
				}
			}
		}
		bw.close();		
	}
}
