package ex0824_NetWork_Reflect;

import java.lang.reflect.Method;

public class ClassReflect_ex1 {
	public static void main(String[] args) {
		String className = "ex0824_NetWork_Reflect.User6";
		
		try {
			Class<?> cls = Class.forName(className);
			Object obj = cls.newInstance();
			
			//메소드 정의
			Method m1 = cls.getDeclaredMethod("hap", new Class[] {Integer.class,Integer.class});
			//(위에 와 같음) Method m1 = cls.getDeclaredMethod("hap", Integer.class,Integer.class);
			Method m2 = cls.getDeclaredMethod("sub",int.class,int.class);
			Method m3 = cls.getDeclaredMethod("print");
			Method m4 = cls.getDeclaredMethod("write",String.class,int.class);
			
			//메소드 호출
			Object rtn = m1.invoke(obj, new Object[] {20,5});
			//(위에와 같음)Object rtn = m1.invoke(obj,20,5);
			m4.invoke(obj, "합", rtn);
			m3.invoke(obj);
			Integer rtn2 = (Integer)m2.invoke(obj, 20,5);
			m4.invoke(obj, "차",rtn2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


class User6{
	public Integer hap(Integer a, Integer b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public void print() {
		System.out.println("print...");
	}
	
	public void write(String title, int s) {
		System.out.println(title+"->"+s);
	}
}