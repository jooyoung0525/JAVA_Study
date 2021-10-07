import java.util.*;
// import java.util.HashMap;
// import java.util.Collections;


class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
       // List<String> answer = new ArrayList<>();
        Map<String,String> m = Collections.synchronizedMap(new HashMap());
        int idx=0;
        
        for(int i = 0; i<record.length; i++){
            String str = record[i];
            String [] splitId = str.split(" ");
            
            if(splitId[0].contains("Enter")){
                m.put(splitId[1],splitId[2]);
               idx++;
            }else if(splitId[0].contains("Change") && m.containsKey(splitId[1])){
                m.remove(splitId[1]);
                m.put(splitId[1],splitId[2]);
            }else if(splitId[0].contains("Leave")){
                idx++;
            }
        }
       // System.out.println("idx"+idx);
       answer = new String[idx];
        int newIdx =0;
        for(int i = 0; i<record.length; i++){
            String str = record[i];
            String [] splitId = str.split(" ");
            String korean="";
            if(splitId[0].contains("Enter")){    
                korean+=(m.get(splitId[1])+"님이 들어왔습니다.");
            }else if(splitId[0].contains("Leave")){
                korean+=(m.get(splitId[1])+"님이 나갔습니다.");
            }else{
                continue;
            }
            answer[newIdx]=korean;
            newIdx+=1;
        }
        
       
        
        // Iterator<String>iter = m.keySet().iterator();
        // while(iter.hasNext()){
        //     System.out.println((String)m.get(iter.next()));
        // }
        
        return answer;
    }
}
