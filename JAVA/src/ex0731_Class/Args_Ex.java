package ex0731_Class;

public class Args_Ex {
	public static void main(String[] args) {
		System.out.println("명령형 인수 예제");
		
		for(int i = 0; i<args.length; i++){
			System.out.println(i+":"+args[i]);
		}
	}
}
