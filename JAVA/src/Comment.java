public class Comment {
	
	//메소드 -> 어떤일을 할 수 있는 가장 작은 단위
    //문서화 주석 (메소드 앞에 주석 다는데 편리) --> /**+엔터 ==>  API만들 때 쓰임 (설명서)
	//cmd창 > javadoc -use Comment.java > 해당경로에 html문서 생성 > 설명html 자동생성
	
	//ctrl + shift + \ ==> 여러줄 주석제거
	//ctrl + shift + / ==> 주석 추가
	
		/**    
		 * 짝수인지 판별하는 메소드
		 * <p> 정수를 2로 나눈 나머지가 0이면 짝수이다. </p>
		 * @param num     짝수인지 판별할 수
		 * @return        짝수 여부를 반환 <code>boolean</code>
		 */
		
		public boolean isEven (int num) { 
			if(num%2 == 0) {
				return true;
			}
			return false;
		}
}
