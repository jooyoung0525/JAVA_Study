import com.user.MyUser;

public class Sample {
	public static void main(String[] args) {
		MyUser obj = new MyUser("ȫ�浿",20,"010");

		System.out.println(obj.name); //ȫ�浿
		//System.out.println(obj.tel); //����. �ڽ�Ŭ���������� ���ٰ���
		System.out.println(obj.isAdult()); //true
	}
}


class Demo extends MyUser{
	public void print() {
		System.out.println(name);
		//System.out.println(age); // ����. age:����Ʈ => ������ ��Ű���� ����
		System.out.println(tel); //protected. �ڽ��� ���� ���������� �ܺ� ��Ű�������� ���� �Ұ�
	}
}