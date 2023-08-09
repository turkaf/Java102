import java.util.ArrayList;

public class Individual extends Account{

	public Individual(User user, AuthenticationStatus authenticationStatus, ArrayList<Insurance> listsOfInsurances) {
		super(user, authenticationStatus, listsOfInsurances);
	}

	@Override
	public void addPolicy() {
		
	}
}