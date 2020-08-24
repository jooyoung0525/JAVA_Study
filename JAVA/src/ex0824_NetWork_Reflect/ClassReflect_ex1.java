package ex0824_NetWork_Reflect;

import java.lang.reflect.Method;

public class ClassReflect_ex1 {
	public static void main(String[] args) {
		String className = "ex0824_NetWork_Reflect.User6";
		
		try {
			Class<?> cls = Class.forName(className);
			Object obj = cls.newInstance();
			
			//�޼ҵ� ����
			Method m1 = cls.getDeclaredMethod("hap", new Class[] {Integer.class,Integer.class});
			//(���� �� ����) Method m1 = cls.getDeclaredMethod("hap", Integer.class,Integer.class);
			Method m2 = cls.getDeclaredMethod("sub",int.class,int.class);
			Method m3 = cls.getDeclaredMethod("print");
			Method m4 = cls.getDeclaredMethod("write",String.class,int.class);
			
			//�޼ҵ� ȣ��
			Object rtn = m1.invoke(obj, new Object[] {20,5});
			//(������ ����)Object rtn = m1.invoke(obj,20,5);
			m4.invoke(obj, "��", rtn);
			m3.invoke(obj);
			Integer rtn2 = (Integer)m2.invoke(obj, 20,5);
			m4.invoke(obj, "��",rtn2);
			
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