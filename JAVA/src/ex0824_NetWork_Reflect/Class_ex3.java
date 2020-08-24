package ex0824_NetWork_Reflect;



public class Class_ex3 {
	public static void main(String[] args) {
		String className = "ex0824_NetWork.UserImpl5";
		try {
			Class<?> cls = Class.forName(className);
			User5 obj = (User5)cls.newInstance();
			
			int c = obj.add(10, 5);
			obj.print("гу", c);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}


interface User5{
	public int add(int a,int b);
	public void print(String title, int c);
}

class UserImpl5 implements User5{

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public void print(String title, int c) {
		System.out.println(title+" : "+c);
		
	}
}