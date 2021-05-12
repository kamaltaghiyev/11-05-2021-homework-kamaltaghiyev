public class MyLinkedList <T> /*implements Iterable<Node>*/{
    Node<T> instance;

    private int size = 0;


    public MyLinkedList() {
        this.instance = null;
    }
    void add(T item){
        Node<T> node = new Node<>(item);
        if(this.instance == null){
            instance = node;

        }else {
            Node<T> transfer = instance;
            while (transfer.next != null) {
                transfer = transfer.next;
            }
            transfer.next = node;
            }
        size++;
        }

    void add(T item, int id )
    {

        if (id > size ) {

            System.out.println(
                    "This index doesn't exist in this list");
            return;
        }
        if (id == 0) {

            Node<T> node = instance;

            instance = new Node<T>(item);


            instance.next = node;

            return;
        }

        Node<T> node = instance;
        Node<T> previous = new Node<>(null);
        while (id > 0) {
            previous = node;
            node = node.next;
            id--;
        }
        previous.next = new Node<T>(item);
        previous.next.next = node;
    }
    T get(int index){
        Node<T> node = instance;
        while (index>0){
            node=node.next;
            index--;
        }
        return node.item;
    }

    Node<T> remove(int index) {
        Node<T> node = instance;
        if (node == null)
        return node;




        if (index == 0)
        {
            node=node.next;
            size--;
            return node;

        }


        for(int i = 0; node != null && i < index - 1; i++)
            node= node.next;
        size--;

        if (node == null || node.next==null)
            return node;


        Node next = node.next.next;



        node.next = next;
        return node;
    }
    int find(T itemToBeFound) {

        Node<T> transfer = instance;
        int i = 0;
        if (instance.item == itemToBeFound) {
            return i;

        }

        while (instance.next != null)  {
            i++;
            transfer = transfer.next;
            if (String.valueOf(transfer.item).equals(
                    String.valueOf(itemToBeFound))) {

                break;
            }


        }
        return i;
    }
public String toString()
{

    String S = "( ";

    Node<T> transfer = instance;

    if (transfer == null)
        return S + " )";

    while (transfer.next != null) {
        S += String.valueOf(transfer.item) + ", ";
        transfer = transfer.next;
    }

    S += String.valueOf(transfer.item);
    return S + " )";
}
}

