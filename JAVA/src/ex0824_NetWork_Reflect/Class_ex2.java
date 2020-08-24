package ex0824_NetWork_Reflect;



public class Class_ex2 {
	
	public static void main(String[] args) {
		String className = "ex0824_NetWork_Reflect.User4"; 
		
		try {
			Class<?> cls = Class.forName(className); //<?>값을 받아올 때 사용
			Object obj = cls.newInstance(); //객체 생성할 때 사용하는 메소드 뉴인스턴스==>"자바가 객체생성"
			//System.out.println(obj); //리턴값이 오브젝트
			
			User4 u = (User4)obj;
			int c = u.add(10,5);
			u.print("합",c);
			
			
		} catch (Exception e) {
		
		}
	}	
}

class User4{
	public int add(int a,int b) {
		return a+b;
	}
	public void print(String title, int c) {
		System.out.println(title +"->"+c);
	}
}