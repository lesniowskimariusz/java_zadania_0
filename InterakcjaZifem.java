package java_zadania_0;

import java.util.Scanner;

public class InterakcjaZifem {

    public static void main(String[] args) {

        int wiek;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swój wiek - ps. dla pełnoletnich");
        wiek = scanner.nextInt();

        if(wiek >= 18) {
            System.out.println("Ok - jak pełnoletni - to zapraszam");
        } else {
            System.out.println("Stop - wracaj do domu");
        }
    }
}
