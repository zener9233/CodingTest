import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.EmptyStackException;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(bf.readLine());
		Stack<Integer> stack = new Stack<>();
		int num = 1;
		int make[] = new int[n];
		ArrayList<Character> ch = new ArrayList<>();
		for(int i = 0; i<n; i++)
		{
			make[i] = Integer.parseInt(bf.readLine());
		}
		for(int i = 0; i<n; i++)
		{
			
			while(true) {
				if(stack.empty())
				{
					stack.add(num);
					num++;	
					ch.add('+');
				}
				else {
			if(make[i] > stack.peek())
			{
				stack.add(num);
				num++;	
				ch.add('+');
			}
			else if(make[i] == stack.peek())
			{
				stack.pop();
				ch.add('-');
				break;
			}
			else {
				num = 0;
				break;
			}
			if(num == 0)
				break;
			}
			}
			if(num == 0)
				break;
		}
		if(num == 0)
		{
			System.out.println("NO");
		}
		else
		{
			for(char result : ch)
			System.out.println(result);
		}
	}
}