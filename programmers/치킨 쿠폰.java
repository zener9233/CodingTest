	class Solution {
		public int solution(int chicken) {
	   int answer = -1;
	        int eat = 0;
	        int cupon =0;
	        int sum = 0;
	       while(chicken/10 > 0) {
	        	eat = chicken/10;
	        	cupon = chicken%10+eat;
	        	chicken = cupon;
	        	sum += eat;
	        	System.out.println(chicken);
	        }
	        answer = sum;
	        System.out.println();
	        return answer;
	    }
	}