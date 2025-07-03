# 📅 Agenda Appuntamenti - Progetto Java

## Descrizione

**Agenda Appuntamenti** è una semplice applicazione da console scritta in Java per gestire i propri appuntamenti giornalieri. Permette di aggiungere, visualizzare, cercare e rimuovere appuntamenti.  
È pensata come esercizio pratico per consolidare concetti base e di OOP (programmazione orientata agli oggetti) in Java.

---

## ✅ Funzionalità principali

- ➕ Aggiungere nuovi appuntamenti
- 📄 Visualizzare tutti gli appuntamenti
- 🔍 Cercare appuntamenti per data
- ❌ Rimuovere appuntamenti per titolo
- 🔢 Visualizzare il numero totale di appuntamenti creati

---

## 📦 Struttura del progetto

Il progetto include le seguenti classi:

### 🔹 `Appuntamento`
Rappresenta un singolo appuntamento.

**Attributi:**
- `String titolo`
- `String descrizione`
- `String data` (formato `gg/mm/aaaa`)
- `String orario` (formato `hh:mm`)

**Metodi principali:**
- Costruttori (uno con tutti i parametri, uno semplificato)
- Getter e setter
- Metodo `toString()` sovrascritto
- Metodo `stampaDettagli()` tramite interfaccia

---

### 🔹 `Agenda`
Contiene e gestisce una lista di appuntamenti.

**Attributi:**
- `ArrayList<Appuntamento> appuntamenti`

**Metodi principali:**
- `aggiungiAppuntamento(Appuntamento a)`
- `visualizzaAppuntamenti()`
- `cercaPerData(String data)`
- `rimuoviAppuntamento(String titolo)`
- `static int contaAppuntamenti()`

---

### 🔹 `Stampabile` (Interfaccia)
Interfaccia con il metodo:
- `void stampaDettagli()`

Implementata dalla classe `Appuntamento`.

---

### 🔹 `Main`
Contiene il menu interattivo da console per usare l’agenda.

**Esempio di menu:**
 
 Benvenuto nella tua Agenda!

    Aggiungi appuntamento

    Visualizza appuntamenti

    Cerca per data

    Rimuovi appuntamento

    Mostra numero appuntamenti

    Esci


---

## 💡 Concetti Java utilizzati

- ✅ Classi e oggetti
- ✅ Costruttori e overload
- ✅ Incapsulamento (getter/setter)
- ✅ Ereditarietà (con interfaccia)
- ✅ Interfacce
- ✅ Metodi statici
- ✅ ArrayList
- ✅ Scanner e input da tastiera
- ✅ Condizioni e cicli

---

## 🚀 Come eseguire il progetto

1. Clona o scarica il progetto.
2. Aprilo in un IDE Java (come IntelliJ IDEA, Eclipse o VS Code).
3. Esegui la classe `Main`.
4. Interagisci con il menu da console.

---

## 🧠 Obiettivo didattico

Questo progetto è pensato per chi ha appena iniziato a studiare Java e vuole esercitarsi in modo concreto sui concetti fondamentali della programmazione orientata agli oggetti.

---

## 📌 Autore

Defendi Mattia,
progetto realizzato come esercitazione personale per lo studio di Java.  


