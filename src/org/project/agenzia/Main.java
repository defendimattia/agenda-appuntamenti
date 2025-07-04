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
                scanner.nextLine();

                switch (userInput) {
                    case 1:
                        System.out.println("------------------------------");
                        System.out.println("Inserisci titolo dell'appuntamento");
                        String titoloInput = scanner.nextLine();
                        System.out.println("Inserisci la data dell'appuntamento in formato gg/mm/aaaa");
                        String dataInput = scanner.nextLine();
                        System.out.println("Inserisci l'ora dell'appuntamento in formato hh:mm");
                        String orarioInput = scanner.nextLine();
                        System.out.println("Vuoi inserire una descrizione? (si/no)");
                        String hasDescrizione = scanner.nextLine();

                        Appuntamento newAppuntamento;

                        if (hasDescrizione.equalsIgnoreCase("si")) {
                            System.out.println("Inserisci descrizione");
                            String descrizioneInput = scanner.nextLine();
                            newAppuntamento = new Appuntamento(titoloInput, descrizioneInput, dataInput,
                                    orarioInput);
                        } else {
                            newAppuntamento = new Appuntamento(titoloInput, dataInput,
                                    orarioInput);
                        }

                        Agenda.aggiungiAppuntamento(newAppuntamento);

                        System.out.println("------------------------------");

                        break;

                    case 2:
                        System.out.println("------------------------------");
                        Agenda.visualizzaAppuntamenti();
                        System.out.println("------------------------------");

                        break;

                    case 3:
                        System.out.println("------------------------------");

                        System.out.println("------------------------------");

                        break;

                    case 4:
                        System.out.println("------------------------------");

                        System.out.println("------------------------------");

                        break;

                    case 5:
                        System.out.println("------------------------------");
                        System.out.println("Numero appuntamenti: " + Agenda.contaAppuntamenti());
                        System.out.println("------------------------------");
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
