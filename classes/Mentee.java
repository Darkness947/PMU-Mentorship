import java.util.ArrayList;
import java.util.List;

public class Mentee extends User {
    protected String MenteeHours;
    protected String MenteeLevel;

    private List<String> createdEvents = new ArrayList<>();

public Mentee (String PMUiD, String FirstName, String LastName, String Email, String Password) {
    this.PMUiD = PMUiD;
    this.FirstName = FirstName;
    this.LastName = LastName;
    this.Email = Email;
    this.Password = Password;
    System.out.println("Mentee created: " + FirstName + " " + LastName);
}

    public boolean login(String email, String password) {
        if (this.Email.equals(email) && this.Password.equals(password)) {
            System.out.println("Login successful");
            return true;
        } else {
            System.out.println("Login failed");
            return false;
        }
    }

    public void createNewEvent(String eventName, String eventId) {
        Event newEvent = new Event(eventName, eventId);
        this.createdEvents.add(eventId);
        System.out.println(newEvent);
        System.out.println("Event created: " + eventName + " with ID: " + eventId);
    }

    @Override
    public void getEvents() {
        System.out.println("Getting events for mentee: " + PMUiD);
    }
}
