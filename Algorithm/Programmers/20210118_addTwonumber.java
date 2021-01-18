package programers;

import java.util.Set;
import java.util.TreeSet;

public class programmers_addtwonumber {
	public static void main(String[] args) {
		int [] ans = new int[10000];
		int [] numbers = {5,0,2,7};
		ans = solution(numbers);
		
		for(int i = 0; i<ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}
	
	 public static int[] solution(int[] numbers) {
	        Set<Integer> s = new TreeSet<Integer>();
		 	
	        for(int i = 0; i<numbers.length-1; i++){
	            for(int j = 1; j<numbers.length; j++){
	                if(i==j)continue;
	                s.add(numbers[i]+numbers[j]);
	            }
	        }
	        
	        Integer[] a = new Integer[s.size()];
	        s.toArray(a);
	        
	        int []answer = new int[a.length];
	         
	        for(int i = 0; i<a.length; i++) {
	        	answer[i] = a[i];
	        }
	        return answer;
	    }
}
