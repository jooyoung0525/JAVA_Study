package ex0807_OtherAPI_Ingeritance;

public class MathClass1 {
	public static void main(String[] args) {
			double a;
			System.out.println(Math.PI);
			
			//sin 30��
			//���� = ���� *3.14/180
			a = Math.sin(30.0*Math.PI/180);
			System.out.println(a); //0.49999999999999994
			
			//12.77 : ���� => 12
			a=Math.floor(12.77);
			System.out.println(a); //12.0
			
			//12.1 => ũ�ų� ���� �� �� ���� ����� ���� :13
			a = Math.ceil(12.1);
			System.out.println(a);//13.0
			
			
			//2�� 10��
			a = Math.pow(2, 10);
			System.out.println(a);//1024.0
			
			
			//0<=����<1
			a=Math.random();
			System.out.println(a); //0.8335979298369732

			
			
	}
}
