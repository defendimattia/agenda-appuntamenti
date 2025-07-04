package org.project.agenzia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Benvenuto nella tua Agenda!");
            System.out.println("1. Aggiungi appuntamento");
            System.out.println("2. Visualizza appuntamenti");
            System.out.println("3. Cerca per data");
            System.out.println("4. Rimuovi appuntamento");
            System.out.println("5. Mostra numero appuntamenti");
            System.out.println("6. Esci");

            System.out.print("Scegli un'opzione: ");
            int userInput = scanner.nextInt();
        }

    }
}
