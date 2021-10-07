
/// 시간초과 -> 조합의 시간복잡도는 O(n^2) ==> 100개의 가짓수는 2^100

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no12865 {
    static int N;
    static int K;
    static int[][]bag;
    static int max = -1;
    static boolean flag = false;

    public static void main(String[] args) throws IOException {

        /// 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st1 = br.readLine();
        String []input = st1.split(" ");
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);
        bag = new int[N][2];

        for(int i = 0; i<N; i++){
            String st2 = br.readLine();
            String []st22 = st2.split(" ");
            bag[i][0]=Integer.parseInt(st22[0]);
            bag[i][1]=Integer.parseInt(st22[1]);
            if(max < bag[i][0]) max = bag[i][0];
        }


        for(int i = N; i>1; i--){
            makeCombinate(0,0,i,0,0);
            if(flag) break;
        }

        System.out.println(max);
    }
    // 선택한갯수, 인덱스번호, 선택해야할갯수, 무게 , 가격
    static void makeCombinate(int depth,int index, int select, int weight, int price){

        if(depth == select){
            if(weight > K) return;
            if(max < price) {
                max = price;
                flag = true;
            }
        }

        for(int i = index; i<N; i++){
            if(weight+bag[i][0] > K) continue;
            makeCombinate(depth+1,i+1,select,weight+bag[i][0],price+bag[i][1]);
            if(flag) break;
        }
        if(flag) return;
    }
}

