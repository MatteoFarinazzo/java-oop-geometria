package org.lesson.java.geometria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Rettangolo rettangolo = new Rettangolo(20, 10);


        System.out.println(rettangolo.getData());

        System.out.println("Crea un nuovo rettangolo");

        System.out.println("Inserisci le dimensioni della base");
        int newBase = Integer.parseInt(scanner.nextLine());

        System.out.println("Inserisci le dimensioni dell' altezza");
        int newHeight = Integer.parseInt(scanner.nextLine());

        Rettangolo nuovoRettangolo = new Rettangolo(newBase, newHeight);

        System.out.println(nuovoRettangolo.getData());

        String printRectangle = nuovoRettangolo.disegna();







    }
}
