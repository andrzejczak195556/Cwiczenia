package pl.com.tt;


import java.util.Iterator;


class Node<T>{
    T value;
    Node<T> nextElement;

    public Node(T value) {
        this.value = value;
    }

    public Node(){

    }
}
public class SinglyLinked<E> implements Iterator<Node<E>>{
    Node<E> head;
    Node<E> current;
    int count;

    public SinglyLinked() {
        this.head = new Node<>();
        this.current = head;

    }

    public void add(E element){

        Node newNode = new Node<E>();
        newNode.value = element;
        current.nextElement = newNode;
        current = newNode;
        count++;

    }

    @Override
    public boolean hasNext() {
        return head.nextElement != null;
    }

    @Override
    public Node<E> next() {
        return head.nextElement;
    }

    @Override
    public void remove() {

    }

    public String print(){
        StringBuilder stb = new StringBuilder();
        Node<E> current = head;
        while (current.nextElement != null){
            current = current.nextElement;
            stb.append(current.value.toString());


        }
        return stb.toString();
    }

}
