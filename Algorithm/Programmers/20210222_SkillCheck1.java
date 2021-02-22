import java.util.ArrayList;
class Solution {
    public int solution(String str1, String str2) {
        double answer = 0;

        //공집합 제거
        if(str1.length()<2 && str2.length()<2) return 65536;


        //1.대문자로 통일
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();


        //2. 두글자씩 끊기
        ArrayList<String>arr1 = new ArrayList<String>();
        ArrayList<String>arr2 = new ArrayList<String>();

        for(int i = 0; i<str1.length()-1; i++) {
            boolean flag = false;
            String multi= str1.substring(i, i+2);
            for(int j = 0; j<2; j++) {
                if(!(multi.charAt(j)>='A'&&multi.charAt(j)<='Z')) {
                    flag = true;
                    break;
                }
            }
            if(!flag) arr1.add(multi);
        }

        for(int i = 0; i<str2.length()-1; i++) {
            boolean flag = false;
            String multi= str2.substring(i, i+2);
            for(int j = 0; j<2; j++) {
                if(!(multi.charAt(j)>='A'&&multi.charAt(j)<='Z')) {
                    flag = true;
                    break;
                }
            }
            if(!flag) arr2.add(multi);
        }

        //공집합 버리기
        if(arr1.size()==0 && arr2.size()==0) return 65536;

        //3. 교집합 구하기
        int intersection = 0;
        boolean []check1 = new boolean[arr1.size()+1];
        boolean []check2 = new boolean[arr2.size()+1];

        for(int i = 0; i<arr1.size(); i++) {
            for(int j = 0; j<arr2.size(); j++) {
                if(check2[j]==true)continue;
                if(arr1.get(i).contains(arr2.get(j))) {
                    check1[i] = true;
                    check2[j] = true;
                    intersection++;
                    break;
                }
            }
        }


        //4.합집합 구하기
        int union = intersection;
        for(int i = 0; i<arr1.size(); i++) {
            if(!check1[i]) union++;
        }
        for(int i = 0; i<arr2.size(); i++) {
            if(!check2[i]) union++;
        }



        //5. 자카드 유사도 계산
        answer = ((double)intersection/(double)union);

        return (int)(answer*65536);
    }
}
