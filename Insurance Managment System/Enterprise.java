import java.util.ArrayList;

public class Enterprise extends Account{

	public Enterprise(User user, AuthenticationStatus authenticationStatus, ArrayList<Insurance> listsOfInsurances) {
		super(user, authenticationStatus, listsOfInsurances);
	}

	@Override
	public void addPolicy() {
		
	}
}