package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no9461 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	/// 파도반 수열 
	long []memo = new long[101];
	Arrays.fill(memo, 0);
	memo[1]=1;
	memo[2]=1;
	memo[3]=1;
	memo[4]=2;
	memo[5]=2;
	for(int i = 6; i<=100; i++) {
		//System.out.println(i);
		memo[i]=memo[i-1]+memo[i-5];
	}
	int T = Integer.parseInt(br.readLine());
	for( int i = 0; i<T; i++) {
		int N = Integer.parseInt(br.readLine());
		System.out.println(memo[N]);
	}
}
}
