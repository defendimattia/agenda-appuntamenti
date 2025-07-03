package org.project.java;

public class Appuntamento {

    private String titolo;
    private String descrizione;
    private String data; // formato gg/mm/aaaa
    private String orario; // formato hh:mm

    public Appuntamento(String titolo, String descrizione, String data, String orario) {
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.data = data;
        this.orario = orario;
    }

    public Appuntamento(String titolo, String data, String orario) {
        this.titolo = titolo;
        this.data = data;
        this.orario = orario;
    }
}
