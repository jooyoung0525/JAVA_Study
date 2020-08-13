package ex0812_Exception_Generic;

public class Generics_Ex6 {
	public static void main(String[] args) {
		IUser<Integer> obj = new UserImpl<>();
		obj.print(10);
	}
}

interface IUser<T> {
	public void print(T t);
}

class UserImpl<T> implements IUser<T> {

	@Override
	public void print(T t) {
		System.out.println(t);
	}

}

class UserImpl2 implements IUser<String> {

	@Override
	public void print(String t) {
		System.out.println(t);
	}

}