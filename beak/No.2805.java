import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;
public class Main {
	public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String st1[] = br.readLine().split(" ");
        long n = Integer.parseInt(st1[0]);
        long m = Integer.parseInt(st1[1]);
        String st2[] = br.readLine().split(" ");
        Integer[] tree = Stream.of(st2).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        long min = 0;
        for(int i : tree)
        	min = Math.max(i, min);
        long max = min-m;
        long result = 0;
        ArrayList<Long> arr = new ArrayList<>();
        long center =(max+min)/2;
         while(max+1<min)
        {
        	center =(max+min)/2;
        	result = 0;
        	 for(int i = 0; i<n; i++)
             {
             	
             	if(tree[i]-center>0)
             		result +=tree[i]-center;
             }
        	 
        	 if(result>=m)
        	 {
        		 arr.add(center);
        		 max = center;
        	 }
        	 else
        	 {
        		 min = center;
        	 }
        }
         if(arr.size() == 0)
        	 bw.write(max+"");
         else
       bw.write(Collections.max(arr)+"");
         
        bw.close();
}
}
