package threads;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class BankAccount {
	private double balanceAmount; // Total amount in bank account
	private static final Object lock = new Object();
	private final Lock lock1 = new ReentrantLock();
	private final Random number = new Random(123L);

	BankAccount(double balance) {
		this.balanceAmount = balance;
	}

	// Deposits the amount from this object instance
	// to BankAccount instance argument ba
	private void depositAmount(BankAccount ba, double amount) {
		synchronized (this) {
			synchronized (ba) {
				if (amount > balanceAmount) {
					throw new IllegalArgumentException("Transfer cannot be completed");
				}
				ba.balanceAmount += amount;
				this.balanceAmount -= amount;
				System.out.println("Transfered");
			}
		}
	}
	
	private void depositAmount1(BankAccount ba, double amount) {
	    synchronized (lock) {
	      if (amount > balanceAmount) {
	        throw new IllegalArgumentException(
	            "Transfer cannot be completed");
	      }
	      ba.balanceAmount += amount;
	      this.balanceAmount -= amount;
	      System.out.println("Transfered");
	    }
	  }
	
	private void depositAmount2(BankAccount ba, double amount) throws InterruptedException {
		while (true) {
			if (this.lock1.tryLock()) {
				try {
					if (ba.lock1.tryLock()) {
						try {
							if (amount > balanceAmount) {
								throw new IllegalArgumentException("Transfer cannot be completed");
							}
							ba.balanceAmount += amount;
							this.balanceAmount -= amount;
							break;
						} finally {
							ba.lock1.unlock();
						}
					}
				} finally {
					this.lock1.unlock();
				}
			}
			int n = number.nextInt(1000);
			int TIME = 1000 + n; // 1 second + random delay to prevent livelock
			Thread.sleep(TIME);
		}
	}

	public static void initiateTransfer(final BankAccount first, final BankAccount second, final double amount) {

		Thread transfer = new Thread(new Runnable() {
			public void run() {
				first.depositAmount(second, amount);
			}
		});
		transfer.start();
	}

	public static void initiateTransfer1(final BankAccount first, final BankAccount second, final double amount) {

		Thread transfer = new Thread(new Runnable() {
			public void run() {
				first.depositAmount1(second, amount);
			}
		});
		transfer.start();
	}
	
	public static void initiateTransfer2(final BankAccount first, final BankAccount second, final double amount) {

		Thread transfer = new Thread(new Runnable() {
			public void run() {
				try {
		            first.depositAmount2(second, amount);
		          } catch (InterruptedException e) {
		            Thread.currentThread().interrupt(); // Reset interrupted status
		          }
			}
		});
		transfer.start();
	}
	public static void main(String[] args) {
		BankAccount a = new BankAccount(5000);
		BankAccount b = new BankAccount(6000);
		BankAccount.initiateTransfer(a, b, 1000); // starts thread 1
		BankAccount.initiateTransfer(b, a, 1000); // starts thread 2
		
		BankAccount a1 = new BankAccount(5000);
		BankAccount b1 = new BankAccount(6000);
		BankAccount.initiateTransfer1(a1, b1, 1000); // starts thread 1
		BankAccount.initiateTransfer1(b1, a1, 1000); // starts thread 2
		
		BankAccount a2 = new BankAccount(5000);
		BankAccount b2 = new BankAccount(6000);
		BankAccount.initiateTransfer2(a2, b2, 1000); // starts thread 1
		BankAccount.initiateTransfer2(b2, a2, 1000); // starts thread 2
	}
}
