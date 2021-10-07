// 하드코딩...
// 모든 경우의수 천천히 다 생각하기! 
// if조건문 잘쓰기


class Solution {
    static String nowL ="*";
    static String nowR ="#";
    static int [][]pathLen = {{1,2,3,4},{2,1,2,3},{3,2,1,2},{4,3,2,1}};
    static String personHand;
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        personHand = hand;
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]==1||numbers[i]==4||numbers[i]==7){
                answer += "L";
                nowL = Integer.toString(numbers[i]);
            }else if(numbers[i]==3||numbers[i]==6||numbers[i]==9){
                answer+= "R";
                nowR = Integer.toString(numbers[i]);
            }else{
                answer+=findHand(numbers[i]);
            }
            
          //  System.out.println("현재 손 "+ nowL + " "+nowR);
        }
                
        return answer;
    }
    
    /// 중간의 손 거리 계산
    static String findHand(int num){
        int leftLen = 0; int rightLen = 0;
        if(num == 2){
            if(nowL.equals("1") == true){
                leftLen = 1;
            }else if(nowL.equals("4")){
                leftLen = 2;
            }else if(nowL.equals("7")){
                leftLen = 3;
            }else if(nowL.equals("*")){
                leftLen = 4;
            }else if(nowL.equals("2")){
                leftLen = 0;
            }else if(nowL.equals("5")){
                leftLen = 1;
            }else if(nowL.equals("8")){
                leftLen = 2;
            }else if(nowL.equals("0")){
                leftLen = 3;
            }
            
            if(nowR.equals("3")){
                rightLen = 1;
            }else if(nowR.equals("6")){
                rightLen = 2;
            }else if(nowR.equals("9")){
                rightLen = 3;
            }else if(nowR.equals("#")){
                rightLen = 4;
            }else if(nowR.equals("2")){
                rightLen = 0;
            }else if(nowR.equals("5")){
                rightLen = 1;
            }else if(nowR.equals("8")){
                rightLen = 2;
            }else if(nowR.equals("0")){
                rightLen = 3;
            }
        }else if(num == 5){
            if(nowL.equals("1")){
                leftLen = 2;
            }else if(nowL.equals("4")){
          //      System.out.print("durl");
                leftLen = 1;
            }else if(nowL.equals("7")){
                leftLen = 2;
            }else if(nowL.equals("*")){
                leftLen = 3;
            }else if(nowL.equals("2")){
                leftLen = 1;
            }else if(nowL.equals("5")){
                leftLen = 0;
            }else if(nowL.equals("8")){
                leftLen = 1;
            }else if(nowL.equals("0")){
                leftLen = 2;
            }
            
            if(nowR.equals("3")){
                rightLen = 2;
            }else if(nowR.equals("6")){
                rightLen = 1;
            }else if(nowR.equals("9")){
                rightLen = 2;
            }else if(nowR.equals("#")){
                rightLen = 3;
            }else if(nowR.equals("2")){
                rightLen = 1;
            }else if(nowR.equals("5")){
                rightLen = 0;
            }else if(nowR.equals("8")){
                rightLen = 1;
            }else if(nowR.equals("0")){
                rightLen = 2;
            }
        }else if(num == 8){
           if(nowL.equals("1")){
                leftLen = 3;
            }else if(nowL.equals("4")){
                leftLen = 2;
            }else if(nowL.equals("7")){
                leftLen = 1;
            }else if(nowL.equals("*")){
                leftLen = 2;
            }else if(nowL.equals("2")){
                leftLen = 2;
            }else if(nowL.equals("5")){
                leftLen = 1;
            }else if(nowL.equals("8")){
                leftLen = 0;
            }else if(nowL.equals("0")){
                leftLen = 1;
            }
            
            if(nowR.equals("3")){
                rightLen = 3;
            }else if(nowR.equals("6")){
                rightLen = 2;
            }else if(nowR.equals("9")){
                rightLen = 1;
            }else if(nowR.equals("#")){
                rightLen = 2;
            }else if(nowR.equals("2")){
                rightLen = 2;
            }else if(nowR.equals("5")){
                rightLen = 1;
            }else if(nowR.equals("8")){
                rightLen = 0;
            }else if(nowR.equals("0")){
                rightLen = 1;
            }
        }else if(num == 0){
            if(nowL.equals("1")){
                leftLen = 4;
            }else if(nowL.equals("4")){
                leftLen = 3;
            }else if(nowL.equals("7")){
                leftLen = 2;
            }else if(nowL.equals("*")){
                leftLen = 1;
            }else if(nowL.equals("2")){
                leftLen = 3;
            }else if(nowL.equals("5")){
                leftLen = 2;
            }else if(nowL.equals("8")){
                leftLen = 1;
            }else if(nowL.equals("0")){
                leftLen = 0;
            }
            
            if(nowR.equals("3")){
                rightLen = 4;
            }else if(nowR.equals("6")){
                rightLen = 3;
            }else if(nowR.equals("9")){
                rightLen = 2;
            }else if(nowR.equals("#")){
                rightLen = 1;
            }else if(nowR.equals("2")){
                rightLen = 3;
            }else if(nowR.equals("5")){
                rightLen = 2;
            }else if(nowR.equals("8")){
                rightLen = 1;
            }else if(nowR.equals("0")){
                rightLen = 0;
            }
        }
        if(leftLen < rightLen){
            // System.out.println("L "+nowL +" "+ leftLen+ " "+rightLen);
            nowL = Integer.toString(num);
           
            return "L";
        }else if(leftLen > rightLen){
            //System.out.println("R "+nowR +" "+ rightLen);
            nowR = Integer.toString(num);
            return "R";
        }else{
            
            if(personHand.contains("left")){
                nowL = Integer.toString(num);
              //  System.out.println("same "+nowL +" "+ leftLen);
                return "L";
            }else{
                nowR = Integer.toString(num);
               //  System.out.println("same "+nowR +" "+ rightLen);
                return "R";
            }
        }
    }
}
