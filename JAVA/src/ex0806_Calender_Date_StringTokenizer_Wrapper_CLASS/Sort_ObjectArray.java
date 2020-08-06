package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

//import java.util.Arrays;

public class Sort_ObjectArray {
	public static void print(String title, User3[] ss) {
		System.out.println(title+"...");
		
		for(User3 u : ss) {
			System.out.print(u.getName()+":"+u.getAge()+" ");
		}
	} 
	
	/*
	//bubble sort
	public static void sorting(User3[] us) {
		
		boolean flag;
		int pass;
		User3 t;
		
		pass=1;
		do {
			flag = false;
			for(int i = 0; i<us.length-pass; i++){
				
				if(us[i].getName().compareTo(us[i+1].getName())>0) {
					t = us[i]; us[i]=us[i+1]; us[i+1]=t; //�ּҰ��� ����
					flag = true;
				}
			}
			pass++;
		}while(flag);
	}
	*/
	
	
	//Selection sort
	public static void sorting(User3[] us) {
		User3 t;
		
		for(int i = 0; i<us.length-1; i++) {
			for(int j = i+1; j<us.length; j++) {
				if(us[i].getName().compareTo(us[j].getName())>0) {
					t = us[i]; us[i]=us[j]; us[j]=t;
				}
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		User3[] us = new User3[5];
		
		us[0]= new User3();
		us[0].setName("ȫ�浿");
		us[0].setAge(20);
		//���� �Ʒ��� ���� ���
		us[1]=new User3("���ڹ�",22); 
		us[2]=new User3("���ڹ�",23); 
		us[3]=new User3("���ڹ�",26); 
		us[4]=new User3("�ʳʳ�",29); 
		print("source data",us);
		
		//Arrays.sort(us);// ��Ÿ�ӿ��� -> ���ڿ�+�������� �����־� sort���� ����(���ı��� ����)
		//String[]�� �ƴ� �ٸ� �Ϲ����� Ŭ������ ��ü �迭�� ���� �Ұ�
		
		sorting(us);
		print("\nsort data",us);
	}
}

class User3{
	private String name;
	private int age;
	
	//������ �����ε� 
	public User3(){	
	}
	public User3(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}