import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String st =bf.readLine();
		String sp[] = st.split(" ");
		int num[] = new int [2];
		
		
		for(int i = 0; i<2; i++)
		{
			String kel[] = sp[i].split("");
			for(int j =0; j<3; j++)
			{
				num[i] = (Integer.parseInt(kel[2])*100)+(Integer.parseInt(kel[1])*10)+(Integer.parseInt(kel[0]));
			}
		}
		
		System.out.println(Arrays.stream(num).max().getAsInt());
	}

}