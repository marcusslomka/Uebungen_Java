public class buch {
    //Atribute
    private String titel;
    private String autor;
    private int isbn;
    private int seitenzahl;

    //Konstruktor
    public buch (String titel, String autor, int isbn, int seitenzahl){
        setTitel(titel);
        setAutor(autor);
        setIsbn(isbn);
        setSeitenzahl(seitenzahl);
    }

    //getter
    public String getTitel(){
        return this.titel;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getIsbn(){
        return this.isbn;
    }
    public int getSeitenzahl(){
        return this.seitenzahl;
    }

    //setter
    public void setTitel(String newTitel){
        this.titel = newTitel;
    }
    public void setAutor(String newAutor){
        this.autor = newAutor;
    }
    public void setIsbn(int newIsbn){
        this.isbn = newIsbn;
    }
    public void setSeitenzahl(int newSeitenzahl) {
        this.seitenzahl = newSeitenzahl;
    }
    
    public String druckeDetails() {         //rückgabe
        return this.titel + " " + this.autor + " " + this.isbn + " " + this.seitenzahl;
    }
}
