package common;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class EvenOddPrinterByExecutorService {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		IntStream.rangeClosed(1, 10)
			.forEach(num -> {
				CompletableFuture<Integer> oddCft = CompletableFuture.completedFuture(num)
						.thenApplyAsync(x -> {
							if(x % 2 == 0) {
								System.out.println(Thread.currentThread().getName() + " " + x);
							}
							return num;
						}, es);
				oddCft.join();
				CompletableFuture<Integer> evenCft = CompletableFuture.completedFuture(num)
						.thenApplyAsync(x -> {
							if(x % 2 != 0) {
								System.out.println(Thread.currentThread().getName() + " " + x);
							}
							return num;
						}, es);
				evenCft.join();
			});
		es.shutdown();

	}

}
