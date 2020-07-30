package ex0730;

import java.util.Arrays;

public class Sort_Speed {
	public static void main(String[] args) {
		
		int [] a= new int[10];
		int [] b= new int[10];
		int [] c= new int[10];
		int [] d= new int[10];
		
		int n,temp,pass;
		long start,end;
		boolean flag = false;
		
		for(int i = 0; i<a.length; i++) {
			n = (int)(Math.random()*1000)+1; //1~1000까지 난수발생
			a[i]=n;
			b[i]=n;
			c[i]=n;
			d[i]=n;
		}
		
		//Array.sort()
		start = System.nanoTime();
		Arrays.sort(a);
		end = System.nanoTime();
		System.out.println("Array.sort(): "+ (end-start));
		
		
		//Selection sort
		start = System.nanoTime();
		for (int i = 0; i < b.length - 1; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] > b[j]) {
					temp = b[i]; b[i] = b[j]; b[j] = temp;
				}
			}
		}
		end = System.nanoTime();
		System.out.println("Selection Sort: "+ (end-start));
		
		
		/*
		//Bubble sort
		start = System.nanoTime();
		for(int i = 1; i<c.length-1; i++) {
			for(int j = 0; j<c.length-i; j++) {
				if(c[j]>c[j+1]) {
					temp = c[j];
					c[j] = c[j+1];
					c[j+1]=temp;
				}
			}
		}
		end = System.nanoTime();
		System.out.println("Bubble Sort: "+ (end-start));
		*/
		
	
		//optimize Bubble sort --> 실행구문(기타연산)수가 많아서 더 느림. 원래는 selection이 더 빠름
		start = System.nanoTime();
		pass = 1;
		do {
			flag = false;
			for(int i = 0; i<d.length-pass; i++) {
				if(d[i]>d[i+1]) {
					temp = d[i]; d[i] = d[i+1]; d[i+1]=temp;
					flag = true;
				}
			}
			pass++;
		}while(flag);
		end = System.nanoTime();
		System.out.println("OptimizeBubble Sort: "+ (end-start));
		
		
		/*
		//Sort 전
		System.out.print("source data: ");
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		Arrays.sort(a);
		
		//Sort 후
		System.out.print("sort data: ");
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.println();
		*/
	}
}
