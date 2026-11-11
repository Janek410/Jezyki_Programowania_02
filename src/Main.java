import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nMENU: \n");
            System.out.println("Wpisz numer zadania aby je odpalić.");
            System.out.println("Zadanie 1: 1");
            System.out.println("Zadanie 2: 2");
            System.out.println("Zadanie 3: 3");
            System.out.println("Aby zakończyć wpisz: 0");

            String odpowiedz = sc.next();

            switch (odpowiedz) {
                case "0" -> {
                    System.out.println("KONIEC PROGRAMU");
                    return;
                }
                case "1" -> Zadania.Zadanie1();
                case "2" -> Zadania.Zadanie2();
                case "3" -> Zadania.Zadanie3();
            }
        }
    }
}
