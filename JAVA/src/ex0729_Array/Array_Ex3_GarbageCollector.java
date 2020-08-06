package ex0729_Array;

public class Array_Ex3_GarbageCollector {
	public static void main(String[] args) {
	
		int a[] = new int[3]; //Heap영역
		a[0] = 10; a[1]=20; a[2]=30;
		
		
		System.out.println("배열의 크기가 3인 경우");
		
		for(int i = 0; i<a.length; i++) { 
			System.out.print(a[i]+" ");
		}
		System.out.println();		
		
		
		
		// 배열은 배열의 크기를 변경할 수 없다.
		// 배열의 크기를 변경하면 이전배열은 
		// garbage collector(메모리회수)의 대상이 된다. 
		
		a = new int[5]; //Heap영역
		System.out.println("배열의 크기가 5인 경우");
		for(int i = 0; i<a.length; i++) { 
			System.out.print(a[i]+" ");
		}
		
		
	}
}
