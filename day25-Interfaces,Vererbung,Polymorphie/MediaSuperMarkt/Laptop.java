
public class Laptop extends Geraet implements IInternetfaehig{
    private String prozessor;

    @Override
    public void verbindenMitInternet() {
        System.out.println("Mit dem internet verbunden!");
        
    }
}
