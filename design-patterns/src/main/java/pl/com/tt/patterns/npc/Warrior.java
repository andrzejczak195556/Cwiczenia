package pl.com.tt.patterns.npc;

/**
 * Created by miszel on 4/19/17.
 */
public class Warrior implements Character {

    private CharacterType characterType;

    public Warrior(CharacterType characterType) {
        this.characterType = characterType;
    }

    public CharacterType getCharacterType() {
        return characterType;
    }
}
