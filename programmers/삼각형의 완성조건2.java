import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
         Arrays.sort(sides);
	       
	        int answer = 0;
	        int count = 0;
	    	int A =	sides[0];
	        int B = sides[1];
	        	
	        System.out.println(A);
	        System.out.println(B);
	        // A<B+C or C<B+A
	        for(int i = B; i< A+B; i++)
	        {
	        	count++;
	        	System.out.println(count+"!");
	        }
	        for(int i = B-A+1; i<B; i++)
	        {
	        	count++;
	        	System.out.println(count+"@");
	        	
	        }
	        answer = count;
	        return answer;
    }
}