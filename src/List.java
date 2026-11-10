import java.util.ArrayList;
import java.util.LinkedList;

public class List {

    public static void TestListy(){

        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        list.add(0, "Jan");
        list.add(0, "Wiktor");

        System.out.println("Arraylist wynik: " + list);

        LinkedList list2 = new LinkedList();
        list2.add("d");
        list2.add("e");
        list2.add("f");

        // Nowy komentarz

        System.out.println("Linkedlist wynik: " + list2);

    }

}
