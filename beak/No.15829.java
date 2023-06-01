import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int L = Integer.parseInt(br.readLine());
        String st[] = br.readLine().split("");
        long sum = 0;
        for(int i = 0; i<st.length; i++)
        {
        	int num1 =((int)st[i].charAt(0)-96);  
        	
        	long num2 = 1;
        	for(int j = 0; j<i; j++)
            	{
            		num2*=31;
            		num2%=1234567891;
            	}
        		sum+=(num1*num2);
        }
        bw.write(sum%1234567891+"");
        bw.close();
	}

}
