public class ForLoopTutorial {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			System.out.println("I love cats!");
		}

		for (int i = 0; i <= 15; i++) {
			System.out.println(i);
		}

		int[] grades = { 98, 100, 83, 90, 93 };

		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
		
		String pokemon[] = {"Charizard\nBlastroise\nVenasaur\nGengar\nSteelix\nSelamance"};
		
		for(int i = 0; i < pokemon.length; i++)
		{
			System.out.println(pokemon[i]);
		}

	}

}