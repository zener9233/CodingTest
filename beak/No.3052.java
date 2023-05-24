import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num[] = new int [10];
		Set<Integer>set = new HashSet<>();
		for(int i = 0; i<10; i++) {
		num[i] = Integer.parseInt(bf.readLine());
		set.add(num[i]%42);
		}
		System.out.println(set.size());		
	}
}