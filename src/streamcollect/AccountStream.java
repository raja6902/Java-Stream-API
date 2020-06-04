package streamcollect;

import java.util.stream.Stream;

public class AccountStream {

	public static void main(String[] args) {
		BankAccount[] actsArray = { new BankAccount(1, "current", 100), new BankAccount(2, "current", 200),
				new BankAccount(3, "SAVING", 300), new BankAccount(4, "current", 400) };

		// find a account balance greater than 150 in current account and increase a
		// balance by 100 find sum.
		double sum = 0;
		for (BankAccount act : actsArray) {
			if (act.getAccountBalance() > 150) {
				if (act.getAccountType().equals("current")) {
					act.increasebalance(100);
					System.out.println("Acct number is  " + act.getAccountNumber() + "  Acct balance is  "
							+ act.getAccountBalance());
					sum += act.getAccountBalance();
				}
			}
		}
		System.out.println("Sum is  " + sum);
		System.out.println("________________________________________________________________________");

		Stream<BankAccount> acctsStream = Stream.of(new BankAccount(1, "current", 100),
				new BankAccount(2, "current", 200), new BankAccount(3, "SAVING", 300),
				new BankAccount(4, "current", 400));
		double result = acctsStream.filter(e -> e.getAccountBalance() > 150)
				.filter(e -> e.getAccountType().equals("current")).peek(e -> e.increasebalance(100))
				.peek(e -> System.out.println(
						"Acct number is  " + e.getAccountNumber() + "  Acct balance is  " + e.getAccountBalance()))
				.mapToDouble(e -> e.getAccountBalance()).sum();

		System.out.println("Sum is  " + result);

	}
}
