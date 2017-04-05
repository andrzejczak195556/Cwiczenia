package pl.com.tt;


public class App {

    public static void main(String[] args) {
        SinglyLinked<Integer> intList = new SinglyLinked<>();

        intList.add(1);
        intList.add(2);
        intList.add(3);

        System.out.println(intList.print());
    }
}
