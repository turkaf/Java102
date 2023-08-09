import java.util.Scanner;

public class UserAccess {
	private static Scanner scan = new Scanner(System.in);
	private AccountManager accountManager;
	
	public void start() {
		System.out.print("Email: ");
		String email = scan.next();
		System.out.print("Şifre: ");
		String password = scan.next();
		
		getAccountManager().login(email, password);
		
	}

	public AccountManager getAccountManager() {
		return accountManager;
	}

	public void setAccountManager(AccountManager accountManager) {
		this.accountManager = accountManager;
	}
}
