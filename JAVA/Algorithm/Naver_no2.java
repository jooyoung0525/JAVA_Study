package naver;

import java.util.PriorityQueue;

public class No2 {
	
	static int Alllen = 0;
	
	public static void main(String[] args) {
		int block[][] = { { 0, 50 }, { 0, 22 }, { 2, 10 }, { 1, 4 }, { 4, -13 } };
		int ans[] = solution(block);
		for (int i = 0; i < Alllen; i++)
			System.out.print(ans[i] + " ");
	}

	public static int[] solution(int[][] blocks) {
		
		int bLength = blocks.length;
		int[][] Pyramid = new int[bLength][bLength];
		boolean[][] Visit = new boolean[bLength][bLength];
		PriorityQueue<Point> q = new PriorityQueue<>();

		
		for (int i = 0; i < bLength; i++) {
			Alllen+=(i+1);
			q.offer(new Point(i, blocks[i][0], blocks[i][1]));
		}

		while (!q.isEmpty()) {

			Point cur = q.poll();
			int curx = cur.x;
			int cury = cur.y;
			int curVal = cur.value;

			if (!Visit[curx][cury]) {
				Visit[curx][cury] = true;
				Pyramid[curx][cury] = curVal;
			}
			if (cury + 1 <= curx && !Visit[curx][cury + 1]) {
				Visit[curx][cury + 1] = true;
				Pyramid[curx][cury + 1] = Pyramid[curx - 1][cury] - curVal;
				q.offer(new Point(curx, cury + 1, Pyramid[curx][cury + 1]));
			}
			if (cury - 1 >= 0 && !Visit[curx][cury - 1]) {
				Visit[curx][cury - 1] = true;
				Pyramid[curx][cury - 1] = Pyramid[curx - 1][cury - 1] - curVal;
				q.offer(new Point(curx, cury - 1, Pyramid[curx][cury - 1]));
			}

			// System.out.println(curx + " " + cury + " " + curVal);
		}
		
		int[] answer = new int[Alllen];
		int idx = 0;
		for (int i = 0; i < bLength; i++) {
			for (int j = 0; j <= i; j++) {
				answer[idx]=Pyramid[i][j];
				idx++;
			}
		}

		
		return answer;
	}

	public static class Point implements Comparable<Point> {
		int x;
		int y;
		int value;

		public Point(int x, int y, int value) {
			super();
			this.x = x;
			this.y = y;
			this.value = value;
		}
		
		@Override
		public int compareTo(Point o1) {
	
			if(o1.x < this.x) return 1;
			return 0;
		}
	}
}
