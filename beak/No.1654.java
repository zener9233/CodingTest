import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        long n = Long.parseLong(st.nextToken());

        long[] c = new long[k];
        long maxC = 0; 
        long sum = 0; 

        for (int i = 0; i < k; i++) {
            c[i] = Long.parseLong(br.readLine());
            maxC = Math.max(maxC, c[i]);
            sum += c[i];
        }
        long start = 1; 
        long end = maxC; 

        long result = 0; 

        while (start <= end) {
            long mid = (start + end) / 2;
            long count = 0;

            for (int i = 0; i < k; i++) {
                count += c[i] / mid;
            }

            if (count >= n) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(result);
    }
}
