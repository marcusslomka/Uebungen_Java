public class Participant {
    String firstName;
    String lastName;
    String email;
    
    public Participant(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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

    public void displayParticipants() {
        for (Participant participant : participants) {
            System.out.println("Teilnehmer: " + participant.firstName + " " + participant.lastName + ", E-Mail: " + participant.email);
        }
    }
}
