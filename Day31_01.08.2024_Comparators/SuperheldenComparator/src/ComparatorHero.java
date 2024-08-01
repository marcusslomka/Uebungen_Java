import java.util.Comparator;

public class ComparatorHero {

    public static Comparator<Superheld> powerLevelComparator = new Comparator<Superheld>() {
        @Override
        public int compare(Superheld s1, Superheld s2) {
            return Integer.compare(s1.getPowerlvl(), s2.getPowerlvl());
        }
    };
    public static Comparator<Superheld> speedComparator = new Comparator<Superheld>() {
        @Override
        public int compare(Superheld s1, Superheld s2) {
            return Integer.compare(s1.getSpeed(), s2.getSpeed());
        }
    };
    public static Comparator<Superheld> nameComparator = new Comparator<Superheld>() {
        @Override
        public int compare(Superheld s1, Superheld s2) {
            return s1.getName().compareTo(s2.getName());
        }
    };
}
