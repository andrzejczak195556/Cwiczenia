package pl.com.tt.patterns.npc;

/**
 * Created by miszel on 4/19/17.
 */
public class Mage implements Character {
    private CharacterType characterType;

    public Mage(CharacterType characterType) {
        this.characterType = characterType;
    }

    public CharacterType getCharacterType() {
        return this.characterType;
    }
}
