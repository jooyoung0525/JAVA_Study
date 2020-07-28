package ex0728;

public class For_Quiz2_040312pdf2 {
	public static void main(String[] args) {
			
		for(int x = 0; x<=10; x++)
		{
			for(int y = 0; y<=10; y++)
			{
				if((3*x)+(6*y) == 27)
					System.out.printf("[%d,%d]\n",x,y);
			}
		}
	}
}
