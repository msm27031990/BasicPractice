package common;

import java.util.Comparator;
import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddPrinterJava8 {
	
	private static Object obj = new Object();
	
	private static IntPredicate even = x -> x % 2 == 0;
	
	private static IntPredicate odd = x -> x % 2 != 0;

	public static void main(String[] args) throws InterruptedException {
		CompletableFuture.runAsync(() -> EvenOddPrinterJava8.printResults(odd));
		CompletableFuture.runAsync(() -> EvenOddPrinterJava8.printResults(even));
		Thread.sleep(1000);
	}
	
	public static void printResults(IntPredicate condition) {
		IntStream.rangeClosed(1, 10)
		.filter(condition)
		.forEach(EvenOddPrinterJava8::execute);
		
	}
	
	
	public static void execute(int i) {
		synchronized (obj) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			obj.notify();
			try {
				obj.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	

}
