package TEMA5.POO.Televisor;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class App {

    static Scanner scanner;

    public static void main(String[] args) {

        Televisor televisor = new Televisor("UAEDUR-00", 55.5, 30);
        scanner = new Scanner(System.in, StandardCharsets.ISO_8859_1);

        int opts;
        do {
            televisor.menu();
            opts = scanner.nextInt();
            switch (opts) {
                case 1, 2:
                    System.out.println(televisor.encenderTelevision());
                    break;
                case 3:
                    televisor.subMenu();
                    break;
                case 4:
                    System.out.println(televisor.subirVolumen());
                    break;
                case 5:
                    System.out.println(televisor.bajarVolumen());
                    break;
                case 6:
                    System.out.println(televisor.silenciado());
                    break;
                case 7:
                    System.out.println(televisor.toString());
                    break;
            }

        } while (opts != 7);
    }
}
