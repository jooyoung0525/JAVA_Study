package ex0812_Exception_Generic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcEx1 {
	public static void main(String[] args) {
		Calc cal = new Calc();
		cal.calculate();
	}
}
class OperatorValidException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public OperatorValidException(String message) {
		super(message);
	}
}

class ArithmeticValidException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	public ArithmeticValidException(String message) {
		super(message);
		this.message = message;
	}
	@Override
	public String toString() {
		return "ArithmeticValidException:"+message;
	}
	
}

class Calc {
	private Scanner sc = new Scanner(System.in);

	public void calculate() {
		int n1, n2;
		char oper;
		try {
			System.out.print("첫번째 수?");
			n1 = inputNumber();

			System.out.print("두번째 수?");
			n2 = inputNumber();

			System.out.print("연산자");
			oper = inputOperator();
			String s = result(n1, n2, oper);
			System.out.println(s);
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력 가능합니다.");
		} catch (OperatorValidException e) {
			System.out.println("연산자 입력이 잘못되었습니다.");
		} catch (ArithmeticValidException e) {
			System.out.println(e.toString());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private int inputNumber() {
		int n;
		try {
			n = sc.nextInt();
		} catch (InputMismatchException e) {
			throw e;
		}
		return n;
	}

	private char inputOperator() throws OperatorValidException {
		char ch = '\0';
		ch = sc.next().charAt(0);

//		if(ch!='+'&&ch!='-'&&ch!='*'&&ch!='/') {
//			new Exception("연산자 입력 오류");
//		}
		String s = Character.toString(ch);
		// s.matches("패턴") => 문자열 s가 패턴에 일치하면 true
		if (!s.matches("(\\+|\\-|\\*|\\/)")) {
			throw new OperatorValidException("연산자 입력 오류");
		}

		return ch;
	}

	private String result(int n1, int n2, char ch) throws ArithmeticValidException {
		String s = null;
		if (ch == '/' && n2 == 0) {
			throw new ArithmeticValidException("0으로 나누면 안된다.");
		}
		switch (ch) {
		case '+':
			s = String.format("%d+%d=%d", n1, n2, n1 + n2);
			break;
		case '-':
			s = String.format("%d+%d=%d", n1, n2, n1 - n2);
			break;
		case '*':
			s = String.format("%d+%d=%d", n1, n2, n1 * n2);
			break;
		case '/':
			s = String.format("%d+%d=%d", n1, n2, n1 / n2);
			break;
		}
		return s;
	}

}