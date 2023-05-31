import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<k; i++)
        {
        	int num = Integer.parseInt(br.readLine());
        	if(num > 0)
        	{
        		st.add(num);
        	}
        	else if(num == 0) {
        		st.pop();
        	}
        	
        }
        if(st.size()>0)
        {
        	long sum = 0;
        	int size = st.size();
        	for(int i = 0; i<size; i++)
        	{
        		sum +=st.pop();
        	}
        	bw.write(sum+"");
        }
        else {
        	bw.write(0+"");
        }
        bw.flush();
        bw.close();
        br.close();
        
	}

}
