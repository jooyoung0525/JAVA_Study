package programers;

public class StockPrice {
	
	public static void main(String[] args) {
		int[] pr = {1, 2, 3, 2, 3};
		int [] ans = solution(pr);
		
		for(int i = 0; i<pr.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}
	
	 public static int[] solution(int[] prices) {
	        int[] answer = new int[prices.length];
	        
	        //최솟값찾기
	        int min = Integer.MAX_VALUE;
	        for(int i = 0; i<prices.length; i++) {
	        	if(min>prices[i])
	        		min = prices[i];
	        }
	        int maxIdx = prices.length-1;
	      
	        for(int i = 0; i<prices.length-1; i++) {
	        	if(min == prices[i]) {
	        		answer[i] = (maxIdx-i);
	        	}
	        	else {
	        		int cnt = 0;
	        		
	        		for(int j = i+1; j<prices.length; j++) {
	        			cnt++;
	        			if(prices[i]>prices[j]) {
	        				break;
	        			}
	        		}
	        		answer[i]=cnt;
	        	}
	        }
	        
	        return answer;
	 }
}
