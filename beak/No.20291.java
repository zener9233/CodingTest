import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class newsordk {
	public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i<n; i++)
        {
        	String st[] = br.readLine().split("[.]");
        	arr.add(st[1]);
        }
        Collections.sort(arr);
        int count = 1;
        for(int i = 1; i<arr.size(); i++)
        {
        	
        	if(arr.get(i).equals(arr.get(i-1)))
        		count++;
        	else
        	{
        		bw.write(arr.get(i-1)+" "+count+""+"\n");
        		count = 1;
        	}
        }
        bw.write(arr.get(arr.size()-1)+" "+count+"");
        bw.close();
	}
}
