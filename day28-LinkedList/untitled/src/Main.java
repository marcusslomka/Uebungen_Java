import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();

        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Diana");
        students.add("Eve");

        students.addFirst("Zara");
        students.addLast("Fred");

        System.out.println("first Student: " + students.getFirst());
        System.out.println("last Student: " + students.getLast());
        System.out.println("Student at the position 3 in the list: " + students.get(2));

        students.removeFirst();
        students.removeLast();
        students.remove(1);

        System.out.println("Alice in liste? " + students.contains("Alice"));
        System.out.println("Eve in liste? " + students.contains("Eve"));

        for (String student : students) System.out.println(student);

        LinkedList<String> newStudents = new LinkedList<>();
        newStudents.add("George");
        newStudents.add("Hannah");
        newStudents.add("Ariana");
        students.add(newStudents.get(0));
        students.add(newStudents.get(1));
        students.add(newStudents.get(2));
        for (String student : students) System.out.println(student);


        students.sort(String::compareTo);
        for (String student : students) System.out.println(student);


    }
}