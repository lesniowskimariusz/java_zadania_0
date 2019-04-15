package java_zadania_0;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args){
        double temp; //zmianna do podanej temperatury
        Scanner scanner = new Scanner(System.in); //inicjalizacja scannera - do pobrania argumentu od usera
        System.out.println("Podaj jaka jest temperatura"); //printuje tekst/pytanie
        temp = scanner.nextDouble(); //przypisanie wartości podanego argumentu do zmiennej
        // warunek złożony z akcjami dla podanych przypadków temperatury
        if (temp > 0) {
            System.out.println("Temperatura jest dodatnia");
        } else if (temp ==0) {
            System.out.println("Temperatura jest zerowa");
        } else {
            System.out.println("Temperatura jest ujemna");
        }

    }
}
