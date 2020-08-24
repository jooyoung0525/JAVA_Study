package ex0824_NetWork_Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassReflect_ex2 {
	public static void main(String[] args) {
		String classname = "ex0824_NetWork_Reflect.UserVO";
		try {
			
			Class<?> cls = Class.forName(classname);
			Object obj = cls.newInstance(); 
			
			Field []ff = cls.getDeclaredFields();
			for(Field f :ff) {
				//System.out.println(f); //UserVO°´Ã¼
				String name = f.getName(); //ÇÊµå¼¼°³ °¡Á®¿È
				//System.out.println(name);
				String first = name.substring(0,1).toUpperCase();
				String last = name.substring(1);
				String setter = "set"+first+last;
				//System.out.println(setter);
				
				Method m = cls.getDeclaredMethod(setter, f.getType());
				if(f.getName().contentEquals("name")){
					m.invoke(obj, "È«±æµ¿");
				}else if(f.getName().contentEquals("tel")) {
					m.invoke(obj,"010-1111-1111");
				}else if(f.getName().contentEquals("age")) {
					m.invoke(obj, 20);
				}
			}
			
			//getter
			for(Field f :ff) {
				String name = f.getName();
				String first = name.substring(0,1).toUpperCase();
				String last = name.substring(1);
				String getter = "get"+first+last;
				//System.out.println(getter);
				
				Method m = cls.getDeclaredMethod(getter);
				Object rt = m.invoke(obj);
				if(f.getType().getName().equals("java.lang.String")) {
					String s = (String)rt;
					System.out.println(f.getName()+" : "+s);
				}else if(f.getType().getName().equals("int")) {
					int i = (int)rt;
					System.out.println(f.getName()+":"+i);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


class UserVO{
	private String name;
	private String tel;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}