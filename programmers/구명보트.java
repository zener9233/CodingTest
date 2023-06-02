import java.util.Arrays;
class Solution {
    public static int solution(int[] p, int limit) {
	        int count = 0;
            int i = 0;
	        Arrays.sort(p);
	        int  j = p.length-1;
	        while(i<=j)
	        {
	        	if(p[i]+p[j]<=limit)
	        	{
	        		j--;
                    i++;
	        	}
                else
                {
                    j--;
                }
	        	count++;
	        }
	        return count;
	    }
}