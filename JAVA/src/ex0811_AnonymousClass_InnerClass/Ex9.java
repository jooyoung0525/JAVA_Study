package ex0811_AnonymousClass_InnerClass;

public class Ex9 {
	public static void main(String[] args) {
		
		//��ø �������̽��� ���ؼ� �͸��� Ŭ������ ����.
		Button.onClickListener obj = new Button.onClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Ŭ��/...");	
			}
		};
		
		obj.onClick();
		
	}
}


//��ø �������̽�
class Button{
	public interface onClickListener{
		public void onClick();
	}
}