import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char B[][] = {
        		{'B','W','B','W','B','W','B','W'},
        		{'W','B','W','B','W','B','W','B'},
        		{'B','W','B','W','B','W','B','W'},
        		{'W','B','W','B','W','B','W','B'},
        		{'B','W','B','W','B','W','B','W'},
        		{'W','B','W','B','W','B','W','B'},
        		{'B','W','B','W','B','W','B','W'},
        		{'W','B','W','B','W','B','W','B'}
        		};
        char W[][] = {
        		{'W','B','W','B','W','B','W','B'},
        		{'B','W','B','W','B','W','B','W'},
        		{'W','B','W','B','W','B','W','B'},
        		{'B','W','B','W','B','W','B','W'},
        		{'W','B','W','B','W','B','W','B'},
        		{'B','W','B','W','B','W','B','W'},
        		{'W','B','W','B','W','B','W','B'},
        		{'B','W','B','W','B','W','B','W'}
        };
        String st[] = br.readLine().split(" ");
        char ch[][] = new char[Integer.parseInt(st[0])][Integer.parseInt(st[1])];
        for(int i = 0; i<ch.length; i++)
        {
        	String wb[] = br.readLine().split("");
        	for(int  j= 0; j<ch[i].length; j++)
        	{
        		ch[i][j] = wb[j].charAt(0);
        	}
        }
       ArrayList<Integer> arr = new ArrayList<>();
        for(int x = 8; x<Integer.parseInt(st[0])+1; x++)
        {
        	for(int y = 8; y<Integer.parseInt(st[1])+1; y++)
        	{
        		int count1 = 0;
        		int count2 = 0;
        		int b1= 0;
                for(int i = x-8; i<x; i++)
                {
                	int b2 = 0;
                	for(int j = y-8; j<y; j++)
                	{
                		if(ch[i][j] != B[b1][b2])
                			count1++;
                		if(ch[i][j] != W[b1][b2])
                			count2++;
                		
                		b2++;
                	}
                	b1++;
                }
                arr.add(count1);
                arr.add(count2);
        	}
        }
        bw.write(Collections.min(arr)+"");
        bw.close();
}
}