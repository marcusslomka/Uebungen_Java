package CleanCode;
import java.util.*;
    
class EventManagementSystem {
    private List<Event> events = new ArrayList<>();
    private List<Participant> participants = new ArrayList<>();

    public void addEvent(String name, Date date, String location, int maxParticipants) {
        Event event = new Event(name, date, location, maxParticipants);
        events.add(event);
    }

    public void removeEvent(String name) {
        Event toRemove = null;
        for (Event event : events) {
            if (event.name.equals(name)) {
                toRemove = event;
                break;
            }
        }
        if (toRemove != null) {
            events.remove(toRemove);
        }
    }

    public void addParticipant(String firstName, String lastName, String email) {
        Participant participant = new Participant(firstName, lastName, email);
        participants.add(participant);
    }

    public void removeParticipant(String email) {
        Participant toRemove = null;
        for (Participant participant : participants) {
            if (participant.email.equals(email)) {
                toRemove = participant;
                break;
            }
        }
        if (toRemove != null) {
            participants.remove(toRemove);
        }
    }

    public void registerParticipantToEvent(String eventName, String participantEmail) {
        Event event = null;
        for (Event e : events) {
            if (e.name.equals(eventName)) {
                event = e;
                break;
            }
        }

        Participant participant = null;
        for (Participant p : participants) {
            if (p.email.equals(participantEmail)) {
                participant = p;
                break;
            }
        }

        if (event != null && participant != null) {
            if (event.participants.size() < event.maxParticipants) {
                event.participants.add(participant);
            } else {
                System.out.println("Maximale Teilnehmerzahl erreicht");
            }
        }
    }

    public void unregisterParticipantFromEvent(String eventName, String participantEmail) {
        Event event = null;
        for (Event e : events) {
            if (e.name.equals(eventName)) {
                event = e;
                break;
            }
        }

        if (event != null) {
            Participant toRemove = null;
            for (Participant p : event.participants) {
                if (p.email.equals(participantEmail)) {
                    toRemove = p;
                    break;
                }
            }
            if (toRemove != null) {
                event.participants.remove(toRemove);
            }
        }
    }

    public void displayEvents() {
        for (Event event : events) {
            System.out.println("Event: " + event.name + ", Ort: " + event.location);
            for (Participant participant : event.participants) {
                System.out.println("Teilnehmer: " + participant.firstName + " " + participant.lastName + ", E-Mail: " + participant.email);
            }
        }
    }

    public void displayParticipants() {
        for (Participant participant : participants) {
            System.out.println("Teilnehmer: " + participant.firstName + " " + participant.lastName + ", E-Mail: " + participant.email);
        }
    }

    public static void main(String[] args) {
        EventManagementSystem system = new EventManagementSystem();
        system.addEvent("Java-Konferenz", new Date(), "Berlin", 100);
        system.addParticipant("Max", "Mustermann", "max@example.com");
        system.registerParticipantToEvent("Java-Konferenz", "max@example.com");
        system.displayEvents();
    }
}

class Event {
    String name;
    Date date;
    String location;
    int maxParticipants;
    List<Participant> participants = new ArrayList<>();

    public Event(String name, Date date, String location, int maxParticipants) {
        this.name = name;
        this.date = date;
        this.location = location;
        this.maxParticipants = maxParticipants;
    }
}

class Participant {
    String firstName;
    String lastName;
    String email;

    public Participant(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}

