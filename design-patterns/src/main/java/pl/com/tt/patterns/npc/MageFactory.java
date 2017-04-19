package pl.com.tt.patterns.npc;

/**
 * Created by miszel on 4/19/17.
 */
public class MageFactory implements CharacterFactory {
    public Character createCharacted(CharacterType characterType) {
        return new Mage(characterType);
    }
}
