import java.util.Iterator;

public class MyIterator implements Iterator<Node> {
    public Node current;

    public MyIterator(Node instance) {
        current = instance;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Node next() {
        Node transfer = current;
        current = current.getNext();
        return transfer;
    }
}
