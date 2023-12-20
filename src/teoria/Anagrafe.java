package teoria;

/*
Questa classe vuol mostrare l&#39;utilizzo di variabili static e non
static in una stessa classe.
Un oggetto di questa classe è una persona che ha un nome, un
cognome, una data di nascita e un numero di matricola CHE VIENE
ASSEGNATO PROGRESSIVAMENTE AD OGNI OGGETTO. Per ottenere questo
risultato si utilizza una variabile static.
*/
public class Anagrafe {
private String nome;
private String cognome;
private int giornoNascita;
private int meseNascita;
private int annoNascita;
// la seguente variabile e&#39; static in modo da essere legata alla
// classe e non ai singoli oggetti.
private static int numeroProgressivo = 0;
//Il valore iniziale deve essere assegnato nella dichiarazione
//(all&#39;atto del caricamento della classe) e non nel costruttore
//(verrebbe altrimenti cambiata ad ogni nuova istanza della classe)
private int numeroMatricola;
// costruttore. Richiede 5 argomenti.
public Anagrafe(String nome, String cognome, int gg, int mm, int aa)
{
this.nome = nome; // this.nome permette di ottenere la variabile
// di istanza nome che altrimenti è coperta
// dalla variabile locale nome (parametro del
// costruttore).
this.cognome = cognome;
this.giornoNascita = gg;
this.meseNascita = mm;
this.annoNascita = aa;
// ogni volta che definisco un nuovo oggetto, incremento la
// variabile static numeroProgressivo che cosi tiene nota
// del numero di oggetti definiti.
numeroProgressivo++;
// la variabile numeroMatricola e&#39; non static, quindi appartiene
// ad ogni oggetto ed avrà un valore diverso per ogni oggetto

// per il primo oggetto creato ha valore 1, per il secondo
// ha valore 2 etc.
this.numeroMatricola = numeroProgressivo;
}

// metodo che stampa i dati di una persona:
public String stampaDati() {
String str = "Nome: " + nome + " cognome: " + cognome +
"\nData di nascita: " + giornoNascita
+ "/" + meseNascita + "/" + annoNascita +
("\nNumero matricola: " + numeroMatricola);

return str;
}

}
// posso mettere il metodo main per testare direttamente la classe,
// senza dover costruire un&#39;altra classe di test.

