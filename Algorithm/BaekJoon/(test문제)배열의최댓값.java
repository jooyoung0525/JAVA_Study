package naver;


public class cloud1 {
public static void main(String[] args) {
	int costs[][] = {{1,2,3},{4,5,6},{7,8,9}};
	//int costs[][] = {{0,0,0},{0,0,0},{0,0,1}};
	System.out.println(solution(costs,100,0));
}

static int solution(int[][] costs, int xcost, int ycost) {
	
	int[][] price = new int[costs.length][costs.length];
	int []xDist = {-1,0};
	int []yDist= {0,-1};
	
	// 배열의 최대값구하기
	for(int i = 0; i<costs.length;i++) {
		for(int j = 0; j<costs.length; j++) {
			int maxCost = price[i][j];
			
			for(int k = 0; k<2; k++) {
				int beforeX = i+xDist[k];
				int beforeY = j+yDist[k];
				if(beforeX == costs.length || beforeY == costs.length)continue;
				
				int nowCost= price[beforeX][beforeY]+costs[i][j]; 
				if(maxCost<nowCost) {
					maxCost=nowCost;
				}
			}
			price[i][j]=maxCost;
		}
	}
	
	/// max가 음수이거나 0이면 0리턴, 아니면 max값 리턴
	int max = 0;
	int downCount = costs.length-1;
	for(int i = 0; i<costs.length; i++) {
		int rightCount = i-1;
		int nowCost = price[costs.length][i]; // 맨 하단 최대 값들
		// 최종적으로 x,y 움직인 방향을 뺀 값
		int costResult = nowCost - (downCount*ycost) - (rightCount * xcost);
		if(max<costResult)max = costResult;
	}
	
//	for(int i = 0; i<price.length; i++) {
//		for(int j = 0; j<price.length; j++) {
//			System.out.print(price[i][j]+" ");
//		}
//		System.out.println();
//	}

	return max;
}

}
