public class Geraet {
    private String marke;
    private String modell;

    public void einschalten() {
        System.out.println("Gerät wird eingeschaltet!");
    }

    public void ausschalten() {
        System.out.println("Gerät wird ausgeschaltet!");
    }

    public void anzeigen() {
        System.out.println("Marke: " + this.marke);
        System.out.println("Modell: " + this.modell);
    }

    public void testGeraet(Geraet g) {
        einschalten();
        anzeigen();
        ausschalten();
    }
}
