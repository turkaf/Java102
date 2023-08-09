import java.util.ArrayList;
import java.util.Date;

public abstract class Account implements Comparable<Account>{
	private User user;
	private AuthenticationStatus authenticationStatus = AuthenticationStatus.FAIL;
	private ArrayList<Insurance> listsOfInsurances;

	public Account(User user, AuthenticationStatus authenticationStatus, ArrayList<Insurance> listsOfInsurances) {
		this.user = user;
		this.authenticationStatus = authenticationStatus;
		this.listsOfInsurances = listsOfInsurances;
	}

	public AuthenticationStatus login(String email, String password) throws InvalidAuthenticationException{
		if(email.equals(user.getEmail()) && password.equals(user.getPassword())) {
			authenticationStatus = AuthenticationStatus.SUCCESS;
			return getAuthenticationStatus();
		}else {
			throw new InvalidAuthenticationException("Geçersiz Kimlik Doğrulaması!");
		}
	}
	
	public boolean isLogin() {
		if(authenticationStatus == AuthenticationStatus.SUCCESS) {
			return true;
		}else {
			return false;
		}
	}
	
	public void addAddress(IAddress address) {
		if(isLogin()) {
			getUser().getAddress().add(address);
		}
	}
	
	public void deleteAddress(IAddress address) {
		if(isLogin()) {
			getUser().getAddress().remove(address);
		}
	}
	
	public void deleteAddress(Date date) {
		this.user.setDate(null);
	}
	
	public abstract void addPolicy();
	
	public final void showUserInfo(User user) {
		System.out.println(user.toString());
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ArrayList<Insurance> getListsOfInsurances() {
		return listsOfInsurances;
	}

	public void setListsOfInsurances(ArrayList<Insurance> listsOfInsurances) {
		this.listsOfInsurances = listsOfInsurances;
	}

	public AuthenticationStatus getAuthenticationStatus() {
		return authenticationStatus;
	}

	public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
		this.authenticationStatus = authenticationStatus;
	}
	
	

	@Override
	public int compareTo(Account o) {
		return this.getUser().getName().compareTo(o.getUser().getName());
	}

	@Override
	public int hashCode() {
		return getUser().getEmail().hashCode() + getUser().getPassword().hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User account = (User) o;
        return getUser().getEmail().equals(account.getEmail()) && getUser().getPassword().equals(account.getPassword());
	}

	@Override
	public String toString() {
		return user.getEmail() + " " + user.getPassword();
	}
}