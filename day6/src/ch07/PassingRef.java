package ch07;
class BankAccount2{
	int balance = 0;
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	public int checkMyBalance() {
		System.out.println("잔액 :" + balance);
		return balance;
	}
}

class PassingRef {
	public static void main(String[] args) {
		BankAccount2 ref = new BankAccount2();
		ref.deposit(3000);
		ref.withdraw(300);
		check(ref);
	}
	
	public static void check(BankAccount2 acc) {
		acc.checkMyBalance();
	}
}
