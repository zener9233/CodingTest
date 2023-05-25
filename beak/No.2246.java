import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = 0;
		n = sc.nextInt();
		int [][]s1 = new int[n][2]; 
		 for (int i = 0; i < n; i++) {
	            int d = sc.nextInt(); // 바닷가와의 거리 d
	            int p = sc.nextInt(); // 숙박비 p
	            s1[i][0] = d;
	            s1[i][1] = p;
	        }
		System.out.println(solution(n,s1));
	}
	public static int solution(int n, int [][]s) {
		int answer = 1;
		int sada = 0;
	
		
		Arrays.sort(s, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]!=o2[0] ? o1[0]-o2[0] : o1[1]-o2[1];
			}
		});
		sada = s[0][1];
		
		
		for(int i = 1; i<n; i++)
		{
			
			if(s[i][1]<sada)
			{
				 sada = s[i][1];
				 
	                answer++;
	        } 
		}
		return answer;
	}
}