package pl.com.tt.patterns.equipment;

/**
 * Created by miszel on 4/19/17.
 */
public class Program {


public static void main(String [] args){
    Equipment e = new Engine(new Engine(new Engine(new BasicEquipment())));

    System.out.println(e.getPrice());
    System.out.println(e.getType());
}
}
