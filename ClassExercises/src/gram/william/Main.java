package gram.william;

public class Main {

    public static void main(String[] args) {
	    BankAccount account = new BankAccount();
	    account.setBalance(1000.15);
	    account.depositFunds(-15d);
	    account.withdrawFunds(15d);

	    BankAccount newAccount = new BankAccount(
	    		12345, 15.5, "WGRAM",
				"wg@mail.com", 12345
		);
		System.out.println(newAccount.getAccountNumber());

		BankAccount emptyAccount = new BankAccount();
    }
}
