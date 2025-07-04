package org.project.agenzia;

import java.util.InputMismatchException;
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

            System.out.print("Scegli un numero: ");
            try {
                int userInput = scanner.nextInt();

                switch (userInput) {
                    case 1:

                        break;

                    case 2:

                        break;

                    case 3:

                        break;

                    case 4:

                        break;

                    case 5:
                        System.out.println(Agenda.contaAppuntamenti());
                        break;

                    case 6:
                        isRunning = false;
                        break;

                    default:
                        System.out.println("Numero non valido. Riprova!");
                        System.out.println("------------------------------");
                }

            } catch (InputMismatchException e) {
                System.out.println("Inserisci un numero!");
                System.out.println("------------------------------");
                scanner.next();
                continue;
            }

        }
        scanner.close();
    }
}
