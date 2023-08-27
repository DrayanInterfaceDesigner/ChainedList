import java.util.Objects;

public class Program {
    public static void main (String[] args) {
        ChainedList list = new ChainedList();
        Node no = new Node();
        Integer integ = 1;
        Object obj = new Object();

        list.Insert(integ);
        list.Insert(2);
        list.Insert(3);
        list.Insert(4);
        list.Insert("aaaaaa");
        list.Insert(obj);
        list.Insert(7);
        list.Insert(8);
        list.Insert(9);
        list.Insert(10);

        //Update example
        list.Update(obj, "Um nuhmehroh estranyo");

        //Delete example
        list.Delete(9);

        //Find example
        System.out.println("Result: " + list.Find("aaaaaa").getInformation());
//        list.Delete(2);

//
//        list.Update(6, 16);
//        System.out.println("Result: " + list.Find(16).getInformation());


        list.printAll();

        //delete head
        list.Delete(integ);

        //delete tail
        list.Delete(10);

        //printing after deletion
        System.out.println("\n---\nOra bolas delito minha cabeca e cauda :/");
        list.printAll();
    }
}
