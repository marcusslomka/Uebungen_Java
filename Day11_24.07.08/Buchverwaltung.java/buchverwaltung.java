public class buchverwaltung {
    public static void main(String[] args) {
        buch buch1 = new buch("buch1","autor1",1,200);
        buch buch2 = new buch("buch2","autor2",2,3300);
        buch buch3 = new buch("buch3","autor3",3,20);
        buch buch4 = new buch("buch4","autor4",4,900);
        buch buch5 = new buch("buch5", "autor5", 5, 2400);

        System.out.println(buch1.druckeDetails());
        System.out.println(buch2.druckeDetails());
        System.out.println(buch3.druckeDetails());
        System.out.println(buch4.druckeDetails());
    }
}
