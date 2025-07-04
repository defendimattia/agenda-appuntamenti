package org.project.agenzia;

import java.util.ArrayList;

public class Agenda {

    private static ArrayList<Appuntamento> listaAppuntamenti = new ArrayList<>();

    public static void aggiungiAppuntamento(Appuntamento newAppuntamento) {
        listaAppuntamenti.add(newAppuntamento);
    }

    public static void rimuoviAppuntamento(String titoloAppuntamentoToDelete) {

        for (int i = listaAppuntamenti.size() - 1; i >= 0; i--)
            if (listaAppuntamenti.get(i).getTitolo().equalsIgnoreCase(titoloAppuntamentoToDelete)) {
                listaAppuntamenti.remove(i);
            }
    }

    public static void visualizzaAppuntamenti() {
        for (Appuntamento appuntamento : listaAppuntamenti) {
            System.out
                    .println(appuntamento.getTitolo() + " " + appuntamento.getData() + " " + appuntamento.getOrario());
        }
    }

    public static void cercaPerData(String dataToSearch) {
        ArrayList<Appuntamento> appuntamentiTrovati = new ArrayList<>();

        for (Appuntamento appuntamento : listaAppuntamenti) {
            if (appuntamento.getData().equals(dataToSearch)) {
                appuntamentiTrovati.add(appuntamento);
            }
        }

        if (appuntamentiTrovati.isEmpty()) {
            System.out.println("Nessun appuntamento trovato");
        } else {
            for (Appuntamento appuntamento : appuntamentiTrovati) {
                appuntamento.stampaDettagli();
            }
        }
    }

    public static int contaAppuntamenti() {
        return listaAppuntamenti.size();
    }

}
