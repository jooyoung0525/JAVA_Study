
//package������ �������� �޶����� ������ default package���� class���� �ۼ� ��, ����

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("����� �μ� ����");
		
		for(int i = 0; i<args.length; i++){
			System.out.println(i+":"+args[i]);
		}
	}
}


// ���ϴ� ���� �Է¹޴� ���  1.Scanner 2.������μ�-->������ �� �ѱ�� ��
// ������μ� ���� ��  a b c�Է� -->  String[] args�� �Ű������� �Ѿ(���ڿ��� ����)