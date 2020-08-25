package ex0825;

import java.util.function.Consumer;
import java.util.function.IntSupplier;

public class Consumer_ex1 {
	public static void main(String[] args) {
		Consumer<Long> c = (t) -> System.out.println(t);
		c.accept(100L);
		
		IntSupplier i = () -> (int)(Math.random()*100)+1;
		System.out.println(i.getAsInt());
	}
}

