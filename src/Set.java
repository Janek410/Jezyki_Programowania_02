import java.util.HashSet;
import java.util.TreeSet;

public class Set {

    public static void Testset() {

        HashSet<String> set = new HashSet<>();
        TreeSet<String> set2 = new TreeSet<>();

        set.add("Wiktor");
        set.add("Jan");
        set.add("Kamil");
        set.add("Kamil");

        set2.add("Wiktor");
        set2.add("Jan");
        set2.add("Kamil");
        set2.add("Kamil");

        System.out.println("Set: \n");

        System.out.println("HashSet przed usunięciem elementu: " + set);
        System.out.println("TreeSet przed usunięciem elementu: " + set2 + "\n");

        set.remove("Jan");
        set2.remove("Jan");

        System.out.println("Hashset po usunięciu elementu: " + set);
        System.out.println("Treeset po usunięciu elementu: " + set2);

    }
}
