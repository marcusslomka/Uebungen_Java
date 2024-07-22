package CleanCode;
import java.util.*;

class EventManagementSystem {
    private List<Event> events = new ArrayList<>();
    private List<Participant> participants = new ArrayList<>();
    
    public static void main(String[] args) {
        EventManagementSystem system = new EventManagementSystem();
        system.addEvent("Java-Konferenz", new Date(), "Berlin", 100);
        system.addParticipant("Max", "Mustermann", "max@example.com");
        system.registerParticipantToEvent("Java-Konferenz", "max@example.com");
        system.displayEvents();
    }
}

