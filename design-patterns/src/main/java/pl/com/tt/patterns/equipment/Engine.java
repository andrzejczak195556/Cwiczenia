package pl.com.tt.patterns.equipment;

/**
 * Created by miszel on 4/19/17.
 */
public class Engine extends EquipmentDecorator {

    public Engine(Equipment equipment) {
        super(equipment);
    }

    @Override
    public int getPrice() {
        return this.equipment.getPrice()+30;
    }
    @Override
    public String getType(){
        return this.equipment.getType()+" "+"Engine";
    }
}
