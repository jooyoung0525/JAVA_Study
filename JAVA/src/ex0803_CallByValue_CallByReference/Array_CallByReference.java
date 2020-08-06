package ex0803_CallByValue_CallByReference;

public class Array_CallByReference {
	public static void main(String[] args) {
		
		User6 ob = new User6();
		int[] n = {1,2,3,4,5};
		
		ob.sub(n); //배열은 참조형변수 -> 주소값을 넘김
		           //Call By Reference
		
		for(int i = 0; i<n.length; i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
}


class User6{
	public void sub(int[] num) {
		num[1]=100;
	}
}