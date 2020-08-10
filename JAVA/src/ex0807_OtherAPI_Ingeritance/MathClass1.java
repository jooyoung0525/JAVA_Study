package ex0807_OtherAPI_Ingeritance;

public class MathClass1 {
	public static void main(String[] args) {
			double a;
			System.out.println(Math.PI);
			
			//sin 30도
			//라디안 = 각도 *3.14/180
			a = Math.sin(30.0*Math.PI/180);
			System.out.println(a); //0.49999999999999994
			
			//12.77 : 절삭 => 12
			a=Math.floor(12.77);
			System.out.println(a); //12.0
			
			//12.1 => 크거나 같은 수 중 가장 가까운 정수 :13
			a = Math.ceil(12.1);
			System.out.println(a);//13.0
			
			
			//2의 10승
			a = Math.pow(2, 10);
			System.out.println(a);//1024.0
			
			
			//0<=난수<1
			a=Math.random();
			System.out.println(a); //0.8335979298369732

			
			
	}
}
