package ex0728;

public class For_Quiz5_040312pdf5 {
	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int input;
		
		do {
			System.out.print("2�̻��� �� ?");
			input = sc.nextInt();
		}while(input<2);
		
		boolean b = false;
		
		for(int i = 2; i<input; i++)
		{
			if(input%i == 0) {
				b = true;
				break;
			}
		}
		
		if(!b)
		{
			System.out.println(input+" : �Ҽ�");
		}
		else {
			System.out.println(input + " :�Ҽ��ƴ�");
		}
		
		sc.close();
		*/
		int cnt = 0;
		
		for(int input = 2; input<=100; input++) {
			
			boolean b = false;
			
			for(int i = 2; i<input; i++)
			{
				if(input%i == 0) {
					b = true;
					break;
				}
			}
			
			if(!b)
			{
				cnt++;
				System.out.printf("%3d",input);
				if(cnt%10 == 0)System.out.println();
			}		
		}
		System.out.println();
		System.out.println("�Ҽ��� ���� : " + cnt);
	}
}
