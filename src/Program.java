public class Program {
    public static void main (String[] args) {
        ChainedList list = new ChainedList();
        Node no = new Node();

        list.Insert(1);
        list.Insert(2);
        list.Insert(3);
        list.Insert(4);
        list.Insert(5);
        list.Insert(6);
        list.Insert(7);
        list.Insert(8);
        list.Insert(9);
        list.Insert(10);


        list.printAll();
    }
}