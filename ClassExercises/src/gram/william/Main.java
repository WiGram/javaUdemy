package gram.william;

public class Main {

    public static void main(String[] args) {
	    /*
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

	     */

	    VipCustomer vip = new VipCustomer();
		System.out.println(vip.getEmail());

		VipCustomer bob = new VipCustomer("Bob", 25000.00);
		System.out.println(bob.getName());
		System.out.println(bob.getCreditLimit());

		VipCustomer tim = new VipCustomer("Tim", 30000.00, "tim@email.com");
		System.out.println(tim.getEmail());
    }
}
