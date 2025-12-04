import java.util.ArrayList;
import java.util.List;

public class Mentor extends User {
    private String ExpertiseArea;
    private List<String> createdEvents; 

    public Mentor(String pmuId, String firstName, String lastName, String email, String password, String expertiseArea) {
        this.PMUiD = pmuId;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Email = email;
        this.Password = password;
        this.ExpertiseArea = expertiseArea;
        this.createdEvents = new ArrayList<>();
        System.out.println("Account Created Successfully: Mentor " + this.FirstName + " " + this.LastName);
    }

    public boolean login(String inputEmail, String inputPassword) {
        if (this.Email.equals(inputEmail) && this.Password.equals(inputPassword)) {
            System.out.println("Login Successful! Welcome, mentor " + this.FirstName + ".");
            return true;
        } else {
            System.out.println("Login Failed: Invalid email or password.");
            return false;
        }
    }

    @Override
    public void getEvents() {
        System.out.println("Mentor " + this.PMUiD + " is viewing the events they have created.");
    }

    public void createEvent(String eventName) {
        this.createdEvents.add(eventName);
        System.out.println("Mentor has created a new event: " + eventName);
    }
}
