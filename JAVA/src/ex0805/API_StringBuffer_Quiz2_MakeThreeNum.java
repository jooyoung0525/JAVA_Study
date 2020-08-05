package ex0805;


//0~9까지 숫자가 서로다른 3자리 정수를 반환
public class API_StringBuffer_Quiz2_MakeThreeNum {
	
	public static void main(String[] args) {
		
		String result = threeNum();
		System.out.print("3자리 수 : ");
		System.out.println(result);
		
	}
	
	
	public static String threeNum() {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<3; i++) {
			
			boolean flag = false;
			int com = (int)(Math.random()*10);	
			
			
			for(int j = 0; j<i; j++) {
				if(sb.indexOf(Integer.toString(com)) > -1)
					flag = true;
			}
			
			
			if(!flag)
				sb.append(Integer.toString(com));
			else
				i--;
		}
		
		
		return sb.toString();
	}
}
