import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        
        String[][] arr2 = new String[n][2]; 
        Set<Integer>set = new HashSet<>();
        for(int i = 0; i<n; i++)
        {
        	String st[]= br.readLine().split(" ");
        	set.add(Integer.parseInt(st[0]));
        	for(int j = 0; j<2; j++)
        	{
        		arr2[i][j] = st[j];
        	}
        }
        br.close();
        Integer[] arr1 = set.toArray(new Integer[0]);
        Arrays.sort(arr1);
        for(int i = 0; i<arr1.length; i++)
        {
        	for(int j = 0; j<n; j++) {
        	if(arr1[i] == Integer.parseInt(arr2[j][0]))
        	{
        		bw.write(arr2[j][0]+" "+arr2[j][1]+"\n");
        	}
        	}
        }
        bw.flush();
        bw.close();
	}
}