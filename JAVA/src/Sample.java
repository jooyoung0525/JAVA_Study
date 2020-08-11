import com.user.MyUser;

public class Sample {
	public static void main(String[] args) {
		MyUser obj = new MyUser("홍길동",20,"010");

		System.out.println(obj.name); //홍길동
		//System.out.println(obj.tel); //에러. 자식클래스에서만 접근가능
		System.out.println(obj.isAdult()); //true
	}
}


class Demo extends MyUser{
	public void print() {
		System.out.println(name);
		//System.out.println(age); // 에러. age:디폴트 => 동일한 패키지만 가능
		System.out.println(tel); //protected. 자식은 접근 가능하지만 외부 패키지에서는 접근 불가
	}
}