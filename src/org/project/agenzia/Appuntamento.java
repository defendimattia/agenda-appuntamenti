package org.project.agenzia;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Appuntamento implements Stampabile {

    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

    private String titolo;
    private String descrizione;
    private String data; // formato gg/mm/aaaa
    private String orario; // formato hh:mm

    public Appuntamento(String titolo, String descrizione, String data, String orario) {
        this.titolo = titolo.toLowerCase().strip();
        this.descrizione = descrizione.toLowerCase().strip();
        setData(data);
        setOrario(orario);
    }

    public Appuntamento(String titolo, String data, String orario) {
        this.titolo = titolo.toLowerCase().strip();
        setData(data);
        setOrario(orario);
    }

    public String getTitolo() {
        return this.titolo;
    }

    public String getDescrizione() {
        if (this.descrizione == null) {
            return "Nessuna descrizione";
        }
        return this.descrizione;
    }

    public String getData() {
        return this.data;
    }

    public String getOrario() {
        return this.orario;
    }

    public void setTitolo(String newTitolo) {
        this.titolo = newTitolo;
    }

    public void setDescrizione(String newDescrizione) {
        this.descrizione = newDescrizione;
    }

    public void setData(String newData) {
        try {
            LocalDate dataFormattata = LocalDate.parse(newData, dateFormatter);
            if (dataFormattata.isAfter(LocalDate.now())) {
                this.data = dataFormattata.format(dateFormatter);
            } else {
                System.out.println("La data inserita non è valida: non è futura!");
            }
        } catch (DateTimeParseException exception) {
            System.out.println("Formato data non valido!");
        }
    }

    public void setOrario(String newOrario) {
        try {
            LocalTime orarioFormattato = LocalTime.parse(newOrario, timeFormatter);
            int ora = orarioFormattato.getHour();
            if (ora >= 8 && ora < 18 && ora != 12) {
                this.orario = orarioFormattato.format(timeFormatter);
            } else {
                System.out
                        .println("L'orario non rientra nelle ore di ricezione appuntamento (08-12 e 13-18)");
            }
        } catch (DateTimeParseException exception) {
            System.out.println("Formato orario non valido!");
        }
    }

    @Override
    public void stampaDettagli() {

        if (this.titolo != null && this.data != null && this.orario != null) {
            System.out.println("Appuntamento");
            System.out.println("Titolo: " + this.titolo);
            System.out.println("Descrizione: " + getDescrizione());
            System.out.println("Data: " + this.data);
            System.out.println("Orario: " + this.orario);
            System.out.println("--------------------");
        } else {
            System.out.println("Uno o più dati essenziali mancanti!");
        }
    }

    @Override
    public String toString() {
        return "Appuntamento {" +
                "titolo=" + this.titolo +
                ", descrizione=" + this.descrizione +
                ", data=" + this.data +
                ", orario= " + this.orario +
                "}";
    }
}
