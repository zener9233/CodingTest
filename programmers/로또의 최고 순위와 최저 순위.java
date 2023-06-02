class Solution {
	    public int[] solution(int[] lottos, int[] win_nums) {
	    	int count1 = 0;
	    	int count2 = 0;
	        
	        for(int i = 0; i<lottos.length; i++)
	        {
	        	if(lottos[i] == 0)
	        		count1++;
	        }
	        for(int i = 0; i<lottos.length; i++)
	        {
	        	for(int j = 0; j<win_nums.length; j++)
	        	{
	        		if(lottos[i] == win_nums[j])
	        		{
	        			count2++;
	        		}
	        	}
	        }
            int n = 7-(count2+count1);
            int m = 7 - count2;
            if(n >= 6)
                n = 6;
            if(m >= 6)
                m = 6;
            
	        int[] answer = { n, m};
	        return answer;
	    }
	}