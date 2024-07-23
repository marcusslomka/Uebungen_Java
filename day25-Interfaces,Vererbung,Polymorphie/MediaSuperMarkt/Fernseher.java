public class Fernseher extends Geraet implements IBluetoothfaehig {
    private int bildschirmgroesse;

    @Override
    public void verbindenMitBluetooth() {
        System.out.println("Mit dem Bluetooth verbunden!");
    }
}
