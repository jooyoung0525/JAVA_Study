package ex0728;



public class While_Quiz1_040302pdf1 {
	public static void main(String[] args) {
		//1-2+3-4..���꿡�� �������� 100�̻��� �Ǵ� �ּ��� ���� �׶��� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		int n, s;
		n = s = 0;
		
		while(true) {
			n++;
			s = n%2==0?s-n:s+n;
			if(s >= 100)break;
		}
		
		System.out.println("n : "+n+", s : "+s);
	}
}
