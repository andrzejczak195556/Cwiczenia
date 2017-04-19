package pl.com.tt.patterns.npc;

/**
 * Created by miszel on 4/19/17.
 */
public class Archer implements Character {
    private CharacterType characterType;

    public Archer(CharacterType characterType) {
        this.characterType = characterType;
    }

    public CharacterType getCharacterType() {
        return this.characterType;
    }
}
