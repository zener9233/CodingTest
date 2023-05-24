import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true)
        {
        	String st = br.readLine();
        	if(st.equals("0 0 0"))
        	{
        		break;
        	}
        	String tr[] = st.split(" ");
        	int num[]  = new int [3];
        	for(int i = 0; i<3; i++)
        	{
        		num[i] = Integer.parseInt(tr[i]);
        	}
        	Arrays.sort(num);
        	if((num[0]*num[0])+(num[1]*num[1]) == num[2]*num[2])
        	{
        		bw.write("right"+"\n");
        	}
        	else
        	{
        		bw.write("wrong"+"\n");
        	}
        }
        bw.close();
	}
}