import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String time = bf.readLine();
		String st[] = time.split(" ");
		int hour = Integer.parseInt(st[0]);
		int min = Integer.parseInt(st[1]);
		min = min-45;
		if(min<0)
		{
			hour--;
			if(hour<0)
			{
				hour = hour+24;
			}
			min = min+60;
		}
		System.out.println(hour+" "+min);
	}

}