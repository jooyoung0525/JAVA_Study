package ex0812_Exception_Generic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_Ex5 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a,b,c;
//		try {
//			System.out.print("첫번째 수?");
//			a=Integer.parseInt(br.readLine());
//			System.out.print("두번째 수?");
//			b=Integer.parseInt(br.readLine());
//			c=a/b;
//			System.out.println("결과: "+c);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}catch(NumberFormatException e) {
//			System.out.println("수만입력 가능합니다....");
//		}catch (ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없어요..");
//		} catch (Exception e) { 
		// 큰 개념의 exception은 아래에 catch 문을 작성해야함
//		// exception : 모든 예외를 catch 한다.
//		System.out.println(e.getMessage());
//	} // 잘 작성된 코드 : 발생가능한 예외를 모두 catch한이후 exception을 마지막 catch한다.
//		
		try {
			System.out.print("첫번째 수?");
			a=Integer.parseInt(br.readLine());
			System.out.print("두번째 수?");
			b=Integer.parseInt(br.readLine());
			c=a/b;
			System.out.println("결과: "+c);
		} catch (Exception e) {
			// exception : 모든 예외를 catch 한다.
			System.out.println(e.getMessage());
		}
	}
}
