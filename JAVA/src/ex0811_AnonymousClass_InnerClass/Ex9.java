package ex0811_AnonymousClass_InnerClass;

public class Ex9 {
	public static void main(String[] args) {
		
		//중첩 인터페이스를 통해서 익명의 클래스를 생성.
		Button.onClickListener obj = new Button.onClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("클릭/...");	
			}
		};
		
		obj.onClick();
		
	}
}


//중첩 인터페이스
class Button{
	public interface onClickListener{
		public void onClick();
	}
}