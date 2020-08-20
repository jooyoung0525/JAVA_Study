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

			oos.writeObject(new User("������", "010", 20));
			oos.writeObject(new User("����", "111", 24));
			oos.close();
			System.out.println("����Ϸ�..");
		} catch (Exception e) {
			// TODO: handle exception
		}
		ObjectInputStream ois = null; //finally ������ close�ؾ��ϱ� ������ try�� ������ ��.
		try {
			 ois = new ObjectInputStream(new FileInputStream(pathname));
			while(true) {
				User vo = (User)ois.readObject();
				System.out.println(vo.getName()+":"+vo.getTel()+":"+vo.getAge());
			}
		} catch (EOFException e) {
			//ObjectInputStream�� ���̻� ���� �ڷᰡ �����Ƿ� EOFException ���ܰ� �߻�
			
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

// ����ȭ ��󿡼� ���ܵǴ°� 
// static ����, �޼ҵ� , transient ���� ==> �Ϲ� �ν��Ͻ� ������ ����ȭ.
class User implements Serializable {

	private static final long serialVersionUID = 1L; // �ش�Ǵ� ��ü�� ã�� ���� ���. --> ��Ȯ�� ��ü�� ã������ ���Ǵ� ����.(�׳� �������ָ��)
	private String name;
	private String tel;
	//transient ==> ��ü�� ����ȭ���� �����ϰ� ������
	private transient int age; // ���̴� ��Ʈ��ũ�� �ۼ����ϰ� ���� ���� ��, transient�� ����.

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
