package pl.com.tt.patterns.npc;

import java.util.Scanner;

public class BeginJourney {

	private static CharacterFactory characterFactory;

	public static void main(String[] args) {
		System.out.println("Choose Character");
		System.out.println("1.Mage");
		System.out.println("2.Warrior");
		System.out.println("3.Archer");
		int characterChoice = 0;
		Scanner scanner = new Scanner(System.in);
		characterChoice = scanner.nextInt();
		switch (characterChoice){
			case 1:
				characterFactory = new MageFactory();
				break;
			case 2:
				characterFactory = new WarriorFactory();
				break;
			case 3:
				characterFactory = new ArcherFactory();
				break;
		}
		System.out.println("Choose Character Race");
		System.out.println("1.Elf");
		System.out.println("2.Human");
		System.out.println("3.Goblin");

		Character character = null;

		int raceChoice = scanner.nextInt();
		switch (raceChoice){
			case 1:
				character = characterFactory.createCharacted(CharacterType.Elf);
				break;
			case 2:
				character = characterFactory.createCharacted(CharacterType.Human);
				break;
			case 3:
				character = characterFactory.createCharacted(CharacterType.Goblin);
				break;
		}

		System.out.println("You have Created"+character.getClass().toString()
				+" "+character.getCharacterType().toString());


	}
	
}
