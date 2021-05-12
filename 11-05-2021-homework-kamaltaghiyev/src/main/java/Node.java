public class Node <T>{
    T item;
    Node<T> next;

    public Node(T item) {
        this.item = item;
        this.next = null;
    }

    public T getItem() {
        return item;
    }

    public Node<T> getNext() {
        return next;
    }
}
