import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String words[] = st.split(" ");
		int count = 0;
		
		for(int i = 0; i<words.length; i++)
		{
			if(words[i] == "")
			{
				continue;
			}
			count++;
		}
		System.out.println(count);
	}

}
