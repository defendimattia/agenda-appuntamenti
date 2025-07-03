package org.project.agenzia;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Appuntamento> listaAppuntamenti = new ArrayList<>();

    public void aggiungiAppuntamento(Appuntamento newAppuntamento) {
        listaAppuntamenti.add(newAppuntamento);
    }

    public void rimuoviAppuntamento(Appuntamento appuntamentoToDelete) {
        listaAppuntamenti.remove(appuntamentoToDelete);
    }

    public void visualizzaAppuntamenti() {
        for (Appuntamento appuntamento : listaAppuntamenti) {
            System.out
                    .println(appuntamento.getTitolo() + " " + appuntamento.getData() + " " + appuntamento.getOrario());
        }
    }

    public void cercaPerData(String dataToSearch) {
        ArrayList<Appuntamento> appuntamentiTrovati = new ArrayList<>();

        for (Appuntamento appuntamento : listaAppuntamenti) {
            if (appuntamento.getData().equals(dataToSearch)) {
                appuntamentiTrovati.add(appuntamento);
            }
        }

        if (appuntamentiTrovati.size() == 0) {
            System.out.println("Nessun appuntamento trovato");
        } else {
            for (Appuntamento appuntamento : appuntamentiTrovati) {
                appuntamento.stampaDettagli();
            }
        }
    }

    static int contaAppuntamenti() {

    }

}
