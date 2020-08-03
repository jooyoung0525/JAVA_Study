
//package있으면 실행방법이 달라지기 때문에 default package에서 class파일 작성 후, 실행

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("명령형 인수 예제");
		
		for(int i = 0; i<args.length; i++){
			System.out.println(i+":"+args[i]);
		}
	}
}


// 원하는 값을 입력받는 방법  1.Scanner 2.명령행인수-->실행할 때 넘기는 거
// 명령행인수 실행 후  a b c입력 -->  String[] args에 매개변수로 넘어감(문자열만 가능)