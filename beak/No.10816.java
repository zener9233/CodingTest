import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;


public class Main {

	public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        String st1[] = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
           int num = Integer.parseInt(st1[i]);
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int m = Integer.parseInt(br.readLine());
        String st2[] = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st2[i]);
            bw.write(freqMap.getOrDefault(num, 0) + " ");
        }
        bw.close();
    }
}