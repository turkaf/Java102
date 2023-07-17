import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		List<String> teams = new ArrayList<>();
		
		teams.add("Takım1");
        teams.add("Takım2");
        teams.add("Takım3");
        teams.add("Takım4");
		
		FixtureGenerator generator = new FixtureGenerator();
		List<Fixture> fixtures = generator.generateFixtures(teams);
		generator.printFixtures(fixtures);
	}
}