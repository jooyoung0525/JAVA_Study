package addresslist;

public class AddressVO {
	private String name;
	private String birth;
	private String phone;
	private String address;
	private String registerdate;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRegisterdate() {
		return registerdate;
	}
	public void setRegisterdate(String registerdate) {
		this.registerdate = registerdate;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		String b;
		b = birth.substring(0, 4)+"-"+birth.substring(4,6)+"-"+birth.substring(6,8);
		String s = "�̸� : "+name+"\n"+"���� : "+b+"\n"+"��ȭ��ȣ : "+phone+"\n"+"�ּ� : "+address+"\n"+"����� : "+registerdate+"\n"+"���� :" +age+"\n";
		return s;
	}	
}
