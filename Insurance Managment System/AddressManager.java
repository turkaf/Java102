
public class AddressManager {
	private IAddress address;
	private User user;
	
	
	
	public AddressManager(IAddress address, User user) {
		this.setAddress(address);
		this.setUser(user);
	}
	
	public void addAddress() {
		getUser().getAddress().add(address);
	}
	
	public void deleteAddress() {
		getUser().getAddress().remove(address);
	}

	public IAddress getAddress() {
		return address;
	}

	public void setAddress(IAddress address) {
		this.address = address;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}