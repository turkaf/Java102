import java.util.List;
import java.util.ArrayList;

public class FixtureGenerator {
	public List<Fixture> generateFixtures(List<String> teams){
		if(teams.size()%2 != 0) {
			teams.add("Bay");
		}
		
		int totalTeams = teams.size();
		int rounds = totalTeams - 1;
		int matchesPerRound = totalTeams / 2;
		
		List<Fixture> fixtures = new ArrayList<>();
		
		for(int round = 0; round < rounds; round++) {
			for(int match = 0; match<matchesPerRound; match++) {
				int home = (round + match) % (totalTeams - 1);
				int away = (totalTeams - 1 - match + round) % (totalTeams - 1);
				
				if(match == 0) {
					away = totalTeams - 1;
				}
				
				fixtures.add(new Fixture(teams.get(home), teams.get(away)));
			}
		}
		
		return fixtures;
	}
	
	public void printFixtures(List<Fixture> fixtures) {
		for(int i = 0; i < fixtures.size(); i++) {
			Fixture fixture = fixtures.get(i);
			System.out.println("Round " + (i+1) + ": " + fixture.getHomeTeam() + " vs " + fixture.getAwayTeam());
		}
	}
}