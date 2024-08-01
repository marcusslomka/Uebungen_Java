public class Superheld {
    private String name;
    private int powerlvl;
    private int speed;
    private Kategorie categorie;

    public Superheld(String name, int powerlvl, int speed, Kategorie categorie) {
        this.name = name;
        this.powerlvl = powerlvl;
        this.speed = speed;
        this.categorie = categorie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerlvl() {
        return powerlvl;
    }

    public void setPowerlvl(int powerlvl) {
        this.powerlvl = powerlvl;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Kategorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Kategorie categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Superheld{" +
                "name='" + name + '\'' +
                ", powerlvl=" + powerlvl +
                ", speed=" + speed +
                ", categorie=" + categorie +
                '}';
    }
}
