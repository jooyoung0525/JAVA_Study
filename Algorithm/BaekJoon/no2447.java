package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class no2447 {
	static char[][] result;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		result = new char[N][N];
		
		makeStar(N,0,0,false);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<N; j++) {
				sb.append(result[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
		br.close();
	}
	
	static void makeStar(int N, int x, int y, boolean isBlank){

		if(isBlank) {
			for(int i = x; i<x+N; i++) {
				for(int j = y; j<y+N; j++) {
					result[i][j]=' ';
				}
			}
			return;
		}
		if(N==1) {
			result[x][y]='*';
			return;
		}
		
		int count = 0;
		for(int i = x; i<x+N; i+=(N/3)) {
			for(int j = y; j<y+N; j+=(N/3)) {
				count++;
				if(count==5) {
					makeStar(N/3,i,j,true);
				}else {
					makeStar(N/3,i,j,false);
				}
			}
		}
		
	}
}
