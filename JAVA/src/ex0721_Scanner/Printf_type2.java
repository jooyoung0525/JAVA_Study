package ex0721_Scanner;

public class Printf_type2 {
	public static void main(String[] args) {
		
		//16������ ���:h
		System.out.printf("%h %h\n", 15, 3456);
		
		//bool��
		System.out.printf("%b\n", true);
		
		//�Ҽ���
		System.out.printf("%f\n",123.23); //123.230000
		System.out.printf("%.2f\n",123.1569); //123.16 (�˾Ƽ� �ݿø�) --> .����f : �Ҽ��� �Ʒ� ���ڸ�ŭ ���
		System.out.printf("%10.2f\n",123.1569); //    123.16 --> ��ü 10�ڸ� ���, �Ҽ����Ʒ� 2�ڸ� ���
		
		//�����ڸ��� �ڸ����� �����ϸ� ����
		System.out.printf("%4.2f\n",123.1569); //123.16 --> ��ü 4�ڸ� ���, �Ҽ����Ʒ� 2�ڸ� ��� 
		System.out.printf("%f\n",12345.0e-03); // 12.345000
		
		System.out.printf("%g\n",123.15); //123.150
		
		//�Ҽ��� 3�ڸ� �Ѿ�� ���� : g
		System.out.printf("%g\n",123.158556);//123.159
		
		System.out.printf("%10.5g\n",123.158556);//    123.16 //10.5g -> 10�ڸ��� ����ϰ�,��ȿ�ڸ���(��¥ ��������ϴ��ڸ�)�� 5�ڸ� 
		System.out.printf("%10.3g\n",123.158556);//       123 //10.3g -> 10�ڸ��� ����ϰ�,��ȿ�ڸ���(��¥ ��������ϴ��ڸ�)�� 3�ڸ� 
		
		System.out.printf("%10.2g\n",123.158556);//   1.2e+02 //10.2g -> 10�ڸ��� ����ϰ�,��ȿ�ڸ���(��¥ ��������ϴ��ڸ�)�� 2�ڸ� 
		//1.2315 * 10�� 2�� => 1.2315e+02
		//1.2e+02
		
		
		//������ �������·� ��� : e  
		//������ 0�� �ƴ� ���� ù ���� ����
		System.out.printf("%e\n",123.158556);//1.231586e+02
		System.out.printf("%10e\n",123.158556);// 1.232e+02
		
		//16������ ���
		// 13(10����): d(16����)
		System.out.printf("%h\n",13);
		System.out.printf("%x\n",13);
		System.out.printf("%X\n",13);
		
		//8����
		System.out.printf("%o\n",13); //13(10����) -> 15(8����)
		
		//�ѹ��� ���
		System.out.printf("%c\n",'A'); //A
		System.out.printf("%c %C\n",'a','a'); //a A
		System.out.printf("%c\n",65); //A
		
		//���ڿ� ���
		System.out.printf("%s\n","korea"); //korea
		System.out.printf("%S\n","Korea"); //KOREA
		
		System.out.printf("%10s\n","korea"); //     korea
		System.out.printf("%10.3s\n","korea"); //       kor
		
		
		int a = 10, b = 5;
		System.out.printf("%d %d %d %d\n", a,a,b,a);
		System.out.printf("%1$d %1$d %2$d %1$d\n", a,b); //1$:ù��° �� ->a , 2$:�ι�° �� ->b
		
		System.out.printf("%(,.2f\n",1235.12345); //1,235.12 --> ,3�ڸ����� �޸� �����
		System.out.printf("%(,.2f\n",-1235.12345); //(1,235.12) -->��ȣ�� �����϶� ��ȣ!		
	}
}