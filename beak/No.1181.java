import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		Set<String>set = new HashSet<String>();
		String st[] = new String[n];
		for(int i = 0; i<n; i++)
		{
			st[i] = bf.readLine();
		}
		for(int i = 0; i<n; i++) {
		set.add(st[i]);
		}
		ArrayList<String> arr = new ArrayList<>();
		arr.addAll(set);
		Comparator<String> c = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.length(), o2.length());
			}
			
		};
		Collections.sort(arr);
		Collections.sort(arr,c);
		for(String test : arr)
		{
			System.out.println(test);
		}
	}

}