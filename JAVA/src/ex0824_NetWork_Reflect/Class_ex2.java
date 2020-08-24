package ex0824_NetWork_Reflect;



public class Class_ex2 {
	
	public static void main(String[] args) {
		String className = "ex0824_NetWork_Reflect.User4"; 
		
		try {
			Class<?> cls = Class.forName(className); //<?>���� �޾ƿ� �� ���
			Object obj = cls.newInstance(); //��ü ������ �� ����ϴ� �޼ҵ� ���ν��Ͻ�==>"�ڹٰ� ��ü����"
			//System.out.println(obj); //���ϰ��� ������Ʈ
			
			User4 u = (User4)obj;
			int c = u.add(10,5);
			u.print("��",c);
			
			
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