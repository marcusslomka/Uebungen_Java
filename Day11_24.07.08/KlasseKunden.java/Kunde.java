public class Kunde {
    private int kundenId;
    private String name;
    private String email;
    private int telefonnummer;

    //Konstruktor
    public Kunde(int kundenId, String name, String email, int telefonnummer) {
        this.setKundenId(kundenId);
        this.setName(name);
        this.setTelefonnummer(telefonnummer);
        this.setEmail(email);
    }

    public Kunde(int kundenId, String name) {
        this.setKundenId(kundenId);
        this.setName(name);
    }

    public Kunde(int kundenId, String name, String email) {
        this.setKundenId(kundenId);
        this.setName(name);
        this.setEmail(email);
    }

    //getter
    public int getKundenId() {
        return this.kundenId;
    }
    public int getTelefonnummer() {
        return this.telefonnummer;
    }
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }
    
    //setter
    public void setKundenId(int newKundenId) {
        this.kundenId = newKundenId;
    }
    public void setTelefonnummer(int newTelefonnummer) {
       this.telefonnummer= newTelefonnummer ;
    }
    public void setName(String newName) {
        this.name=newName ;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }
    
    public String toString() {
        return this.name + " " + this.kundenId + " " + this.telefonnummer;
    }
}

