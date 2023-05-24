import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String st[] = bf.readLine().split(" ");
		int x = Integer.parseInt(st[0]);
		int y = Integer.parseInt(st[1]);
		int w = Integer.parseInt(st[2]);
		int h = Integer.parseInt(st[3]);
		int n[] = new int [4];
		n[0] = x;
		n[1] = y;
		n[2] = w-x;
		n[3] = h-y;
		Arrays.sort(n);
		System.out.println(n[0]);
    }
}