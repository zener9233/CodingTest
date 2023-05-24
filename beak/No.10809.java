import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		char ch[] = new char[26];
		for(int i =0; i<ch.length; i++)
		{
			ch[i] = (char)(97+i);
		}
		
		for(int i =0; i<ch.length; i++)
		{
			int count = 0;
			for(int j = 0; j<st.length(); j++)
			{
				if(ch[i] == st.charAt(j))
				{
					count++;
					if(count == 1)
					{
						System.out.print(j);
						break;
					}
				}
			}
			if(count == 0)
			{
				System.out.print("-1");
			}
			System.out.print(" ");
		}
	}

}