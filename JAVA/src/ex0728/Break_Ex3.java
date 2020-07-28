package ex0728;

public class Break_Ex3 {
	public static void main(String[] args) {
	
		gogo:
		for(int i = 1; i<=3; i++)
		{
			for(int j = 1; j<=3; j++)
			{
				if(i+j==4)break gogo; // for(int i = 1 빠져 나감)
				System.out.println("i:"+i+", j: "+j);
			}
		}
	}
}
