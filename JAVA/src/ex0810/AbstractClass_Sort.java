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
		
		
		//SortInt ob = new SortInt(); //������ ����. �߻�Ŭ������ ��ü���� �Ұ�
		//SortInt si = new SelectionSort(); //��ĳ����
		
		
		
		SortInt si = new BubbleSort();
		
		System.out.print("source data : ");
		print(value);
		
		si.sort(value); //�ڽ��� �ƹ����� 
		System.out.print("sort data : ");
		print(value);
	}
}

abstract class SortInt{ //�߻�Ŭ���� => �߻�޼ҵ尡 ��� �߻�Ŭ���� ��������
	                    //��ü�����Ұ�
	
	private int[] value;
	
	protected abstract void sorting();
	public void sort(int[] value) {
		
		this.value=value;
		
		sorting(); //�ڽ���  sorting()
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

//�߻�Ŭ���� ��ӹ����� �߻�Ŭ������ ��� �޼ҵ� �������ʿ�
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
	protected void sorting() { //�ƺ��� SortInt�� �߻�Ŭ�����̱� ������ �߻�Ŭ��������
		                       //���ǵ��� ���� sorting�� �ڽ�Ŭ�������� ������(override)�Ͽ� ����Ͽ�����.
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