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
        int n = Integer.parseInt(br.readLine());
        int num[] =new int [n];
        int sum = 0;
        for(int i = 0; i<n; i++)
        {
        	num[i] = Integer.parseInt(br.readLine());
        	sum += num[i];
       
        }
        
        Arrays.sort(num);
        boolean fal =false;
        int max = 0;
        int mode = 10000;
        for(int i = 0; i< n; i++) {
        	int count1 = 0;
        	int count2 = 1;
        	int values = num[i];
        	for(int j = i+1; j<n; j++)
        	{
        		if(values != num[j]) {
        			break;
        		}
        		count1++;
        		count2++;
        	}
        	if(count2 >max) {
            	max = count2;
            	mode = values;
            	fal = true;
            }
        	else if(count2 == max && fal == true) {
        		mode = values;
        		fal = false;
        	}
        	i+=count1;
        }
                
        bw.write((int)Math.round((double)sum/n)+""+"\n");
        bw.write(num[n/2]+""+"\n");
        bw.write(mode+""+"\n");
        bw.write((num[n-1]-num[0])+""+"\n");
        bw.flush();
        br.close();
        bw.close();
        
	}

}
