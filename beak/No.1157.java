import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		int count = 0;
		st = st.toUpperCase();//소문자를 대문자로 바꿔주는 친구 (반대는 toLowerCase)
		ArrayList<Character> arr = new ArrayList<>();
		for(int i = 0; i<st.length(); i++)
		{	
			arr.add(st.charAt(i));
		}
		Set<Character> set = new HashSet<>(arr);
		for(char ch2 :set)
		{
			count++;
		}
		int num1[] = new int[count];
		int num2[] = new int[count];
		char ch[] = new char[count];
		int i =0;
		for(char ch2 : set)
		{
			ch[i] = ch2;
			num1[i] = Collections.frequency(arr, ch2);
			num2[i] = Collections.frequency(arr, ch2);
			i++;
		}
		Arrays.sort(num2);
		int count2 = 0;
		for(int j = 0; j<count; j++)
		{
			if(num2[count-1]==num1[j])
			{
				count2++;
			}
		}
		if(count2>1)
		{
			System.out.println("?");
		}
		else
		{
			for(int j = 0; j<count; j++)
			{
				if(num2[count-1]==num1[j])
				{
					System.out.println(ch[j]);
				}
			}
		}
		
		
	}	

}
