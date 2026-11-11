import java.util.*;

class Zadania {
    static void Zadanie1(){

        /*
         Zaimplementuj program, który przyjmuje od użytkownika ciąg liczb i przechowuje je w zbiorze typu HashSet i TreeSet.
         Następnie wyświetl różnice między HashSet a TreeSet w kontekście kolejności elementów.
        */

        HashSet<Integer> hashset_liczb = new HashSet<Integer>();
        TreeSet<Integer> treeset_liczb = new TreeSet<Integer>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Wprowadz 5 liczb: ");

        for (int i = 0; i < 5; i++){

            int liczba = sc.nextInt();
            hashset_liczb.add(liczba);
            treeset_liczb.add(liczba);

        }

        System.out.println("HashSet: " + hashset_liczb);
        System.out.println("TreeSet: " + treeset_liczb);

    }

    static void Zadanie2(){

        /*
         Stwórz program, który dodaje, usuwa i modyfikuje elementy w dwóch listach typu ArrayList i LinkedList.
         Następnie zmierz czas wykonywania tych operacji i porównaj wyniki.
        */

        // Mierzony czas dla ArrayList

        int ilosc_operacji = 100000;

        ArrayList<String> owoce = new ArrayList<String>();

        long startTime1 = System.nanoTime();

        for (int i = 0; i < ilosc_operacji; i++){

            // dodaje elementy
            owoce.add("Jabłko");
            owoce.add("Banan");
            owoce.add("Arbuz");

            // usuwa elementy
            owoce.remove("Arbuz");

            // modyfikuje elementy
            owoce.set(1,"Winogorono");

        }

        long estimatedTime = System.nanoTime() - startTime1;
        double seconds1 = (double) estimatedTime / 1000000000.0;
        System.out.println("Czas wykonywania operacji w ArrayList: " + seconds1 + " sekund");

        //Mierzony czas dla ArrayList dla tych samych danych

        LinkedList<String> owoce2 = new LinkedList<String>();

        long startTime2 = System.nanoTime();

        for (int i = 0; i < ilosc_operacji; i++){

            owoce2.add("Jabłko");
            owoce2.add("Banan");
            owoce2.add("Arbuz");

            owoce2.remove("Arbuz");

            owoce2.set(1,"Winogorono");

        }

        long estimatedTime2 = System.nanoTime() - startTime2;
        double seconds2 = (double) estimatedTime2 / 1000000000.0;
        System.out.println("Czas wykonywania operacji w LinkedList: " + seconds2 + " sekund");

        double difference = (double) Math.abs((estimatedTime - estimatedTime2))/ 1000000000.0;
        System.out.println("Roznica: " + difference + " sekund");
    }
}
