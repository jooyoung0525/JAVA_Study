package ex0824_NetWork_Reflect;

import java.lang.reflect.Constructor;

public class Class_ex1 {
	public static void main(String[] args) {
		try {
			Class<?> cls = Class.forName("java.lang.String");
			//Class<?> cls = String.class;
			
			System.out.println("\n상위클래스...");
			if(cls.getSuperclass()!= null) {
				System.out.println(cls.getSuperclass().getName());
			}
			
			System.out.println("\n생성자");
			Constructor<?>[] cc = cls.getConstructors();
			for(Constructor<?>c:cc){
				System.out.println(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
