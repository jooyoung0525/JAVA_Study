package ex0810;

public class AbstractClass_Sort {
	
	public static void print(int[] value) {
		for(int n : value) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] value = {30,25,75,20,62,45,1,70};
		
		
		//SortInt ob = new SortInt(); //컴파일 오류. 추상클래스는 객체생성 불가
		//SortInt si = new SelectionSort(); //업캐스팅
		
		
		
		SortInt si = new BubbleSort();
		
		System.out.print("source data : ");
		print(value);
		
		si.sort(value); //자식이 아버지꺼 
		System.out.print("sort data : ");
		print(value);
	}
}

abstract class SortInt{ //추상클래스 => 추상메소드가 없어도 추상클래스 생성가능
	                    //객체생성불가
	
	private int[] value;
	
	protected abstract void sorting();
	public void sort(int[] value) {
		
		this.value=value;
		
		sorting(); //자식의  sorting()
	}
	
	protected int length() {
		
		int n = -1;
		if(value !=null) {
			n= value.length;
		}
		return n;
	}
	
	protected final int compare(int i , int j) {
		return value[i]-value[j];
	}
	
	protected final void swap(int i, int j) {
		int t = value[i];
		value[i]=value[j];
		value[j]=t;
	}
}

//추상클래스 상속받으면 추상클래스의 모든 메소드 재정의필요
class SelectionSort extends SortInt{ 
	
	@Override
	protected void sorting() {
		for(int i = 0; i<length()-1; i++) {
			for(int j = i+1; j<length(); j++) {
				if(compare(i,j)>0) {
					swap(i,j);
				}
			}
		}
		
	}
}

class BubbleSort extends SortInt{

	@Override
	protected void sorting() { //아빠인 SortInt가 추상클래스이기 때문에 추상클래스에서
		                       //정의되지 않은 sorting을 자식클래스에서 재정의(override)하여 사용하여야함.
		int pass = 1;
		boolean flag;
		
		do {
			flag = false;
			for(int i = 0; i<length()-pass; i++) {
				if(compare(i,i+1)>0) {
					swap(i,i+1);
					flag = true;
				}
			}
			pass++;
		}while(flag);
		
	}
	
}