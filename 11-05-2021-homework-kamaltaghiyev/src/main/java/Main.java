public class Main {
    public static void main(String[] args) throws Exception {
        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        list1.add(100);
        list1.add(200);
        list1.add(300);
        list1.add(500,1);
        System.out.println(list1);
        System.out.println(list1.get(1));
        list1.remove(2);
        System.out.println(list1);
        System.out.println(list1.find(300));
    }
}
