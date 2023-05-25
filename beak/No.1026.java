import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int zeal = sc.nextInt();
		int yuma[] = new int[zeal];
		int astral[] = new int[zeal];
		int xyz = 0;
		
		for(int i = 0; i<zeal; i++)
		{
			yuma[i] = sc.nextInt();
		}
		for(int i = 0; i<zeal; i++)
		{
			astral[i] = sc.nextInt();
		}
		Arrays.sort(yuma);
		Arrays.sort(astral);
		for(int i = 0; i<zeal; i++)
		{
			xyz += yuma[i]*astral[zeal-1-i];
		}
		System.out.println(xyz);
	}

}