package ex0819;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializable_ex1 {

	public static void main(String[] args) {
		String pathname = "demo.txt";
		try {
			FileOutputStream fos = new FileOutputStream(pathname);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(new User("하하하", "010", 20));
			oos.writeObject(new User("후후", "111", 24));
			oos.close();
			System.out.println("저장완료..");
		} catch (Exception e) {
			// TODO: handle exception
		}
		ObjectInputStream ois = null; //finally 블럭에서 close해야하기 때문에 try블럭 밖으로 뺌.
		try {
			 ois = new ObjectInputStream(new FileInputStream(pathname));
			while(true) {
				User vo = (User)ois.readObject();
				System.out.println(vo.getName()+":"+vo.getTel()+":"+vo.getAge());
			}
		} catch (EOFException e) {
			//ObjectInputStream은 더이상 읽을 자료가 없으므로 EOFException 예외가 발생
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(ois!= null) {
				try {
					ois.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}

}

// 직렬화 대상에서 제외되는것 
// static 변수, 메소드 , transient 변수 ==> 일반 인스턴스 변수만 직렬화.
class User implements Serializable {

	private static final long serialVersionUID = 1L; // 해당되는 객체를 찾기 위한 방법. --> 정확한 객체를 찾기위해 사용되는 숫자.(그냥 선언만해주면됨)
	private String name;
	private String tel;
	//transient ==> 객체를 직렬화에서 제외하고 싶을때
	private transient int age; // 나이는 네트워크로 송수신하고 싶지 않을 때, transient를 붙임.

	public User() {
	}

	
	public User(String name, String tel, int age) {
		this.name = name;
		this.tel = tel;
		this.age = age;

	}

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
