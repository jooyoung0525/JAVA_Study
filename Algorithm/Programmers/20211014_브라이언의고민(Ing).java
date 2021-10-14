class Solution {
    public String solution(String sentence) {
        String answer = "";
        boolean []alpha = new boolean[26];
        
//         char ch = 'z';
//         System.out.print(ch-'0');
        
       
        for(int i = 0; i<sentence.length(); i++){
            System.out.println(i);
            char chNum = sentence.charAt(i);
            int lastchNum = 0;
            int action = 0;
            
            //특수문자이면 멈춤
            if(chNum>='a'&&chNum<='z'){
                
                /// 같은 특수문자는 사용불가
                if(alpha[chNum-'a']){
                    answer = "invalid";
                    return answer;
                }
                alpha[chNum-'a']=true;
                
                // 1.같은 특수문자의 끝이 어딘지 찾기
                lastchNum = sentence.lastIndexOf(chNum);
               
                // 2.몇번 규칙인지 파악
                boolean one = false;
                for(int j = i; j<=lastchNum; j+=2){
                   if(chNum != sentence.charAt(j)){
                       one = true;
                   }
                }
                if(!one){
                    if(i-2>=0){
                        if(sentence.charAt(i-2) >='A'&&sentence.charAt(i-2) <= 'Z')
                            action = 1;
                        
                        
                    }
                        
                }else{
                    action = 2;
                }
                
                int last = 0;
                //1번일경우
                if(action==1){
                  //  System.out.println(chNum);
                    String now="";
                    String newStr;
                    if(lastchNum+2 > sentence.length()){
                        newStr = sentence.substring(i-1,lastchNum+1);
                        i = lastchNum+1;
                    }else{
                        newStr = sentence.substring(i-1,lastchNum+2);
                        i = lastchNum+1;
                    }
                    System.out.println(newStr);
                    for(int k = 0; k<newStr.length(); k++){
                       if(newStr.charAt(k)==chNum)continue;
                        now+=newStr.charAt(k);
                    }
                 
                    answer+=now;
                    if(i<sentence.length()) 
                        answer+=" ";    
                    
                }
                else if(action==2){
                     // System.out.println(lastchNum);
                     String newStr = sentence.substring(i+1,lastchNum);
                    i = lastchNum;
                      // System.out.println(newStr);
                    for(int k = 0; k<newStr.length(); k++){
                        if(newStr.charAt(k)>='a' && newStr.charAt(k)<='z')
                        {
                            answer = "invalid";
                            return answer;
                        }
                    }
                    answer+=newStr;
                    if(i<sentence.length()) 
                        answer+=" ";    
                }
            }
        }
        
        return answer;
    }
}
