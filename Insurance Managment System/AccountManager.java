import java.util.TreeSet;

public class AccountManager {
	private TreeSet<Account> accountLists;
	private Account account;
	
	public Account login(String email, String password) {
		String loginStatus = email + " " + password;
		for(Account list: accountLists) {
			if(loginStatus.equals(list.toString())) {
				this.account = list;
				try {
					getAccount().login(email, password);
				} catch (InvalidAuthenticationException e) {
					System.out.println(e.getMessage());
				}
				return getAccount();
			}
		}
		return null;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}