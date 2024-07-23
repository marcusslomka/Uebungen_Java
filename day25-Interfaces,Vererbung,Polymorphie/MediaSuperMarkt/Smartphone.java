public class Smartphone extends Geraet implements IInternetfaehig, IBluetoothfaehig {
    private String betriebssystem;

    @Override
    public void verbindenMitInternet() {
        System.out.println("Mit dem internet verbunden!");
        
    }

    @Override
    public void verbindenMitBluetooth() {
        System.out.println("Mit dem Bluetooth verbunden!");
    }


    
}
