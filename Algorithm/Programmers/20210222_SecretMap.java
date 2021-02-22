// #프로그래머스 스킬테스트 level1
// #비밀지도

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i<n; i++){ //정사각 한변길이
            
            String newa="";
            String newb="";
            String a =  Integer.toBinaryString(arr1[i]);
            String b =  Integer.toBinaryString(arr2[i]);
            
            if(a.length()<n){
              
                int pluszero = n-a.length();
                for(int j = 0; j<pluszero; j++){
                    newa+='0';
                }
                newa+=a;
            }else{
                newa = a;
            }
            
            if(b.length()<n){
               
                int pluszero = n-b.length();
                for(int j = 0; j<pluszero; j++){
                    newb+='0';
                }
                newb+=b;
            }else{
                newb = b;
            }
            
            String ans ="";
            for(int j = 0; j< n; j++){ //두 지도 비교
                if(newa.charAt(j)=='0' && newb.charAt(j)=='0'){
                    ans+=" ";
                }else{
                    ans+="#";
                }
            }
            
            answer[i]=ans;
        }
        
        return answer;
    }
}
