import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Stack<String> stack = new Stack<>();
		int n =Integer.parseInt(bf.readLine());
		String []st = new String[n];
		for(int i = 0; i<n; i++)
		{
			st[i] = bf.readLine();
		}
		for(int i = 0; i<n; i++)
		{
				String[]sp = st[i].split(" ");
				if(sp[0].equals("push"))
				{
					stack.push(sp[1]);
				}
				else if(sp[0].equals("pop"))
				{
					if(stack.empty())
					{
						System.out.println("-1");
					}
					else {
						System.out.println(stack.pop());
					}
				}
				else if(sp[0].equals("size"))
				{
					System.out.println(stack.size());
				}
				else if(sp[0].equals("empty"))
				{
					if(stack.empty())
					{
						System.out.println("1");
					}
					else {
						System.out.println("0");
					}
				}
				else if(sp[0].equals("top"))
				{
					if(stack.empty())
					{
						System.out.println("-1");
					}
					else
					{
						System.out.println(stack.peek());
					}
				}	
		}
		
		
	}

}
