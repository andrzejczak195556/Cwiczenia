package pl.com.tt.patterns.equipment;

/**
 * Created by miszel on 4/19/17.
 */
public abstract class EquipmentDecorator implements Equipment {

    protected Equipment equipment;

    public EquipmentDecorator(Equipment equipment) {
        this.equipment = equipment;
    }

    public String getType() {
        return equipment.getType();
    }

    public int getPrice()
    {
        return equipment.getPrice();
    }
}
