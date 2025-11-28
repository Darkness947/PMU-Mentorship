public class Event {
    private String EventName;
    private String EventId;
    private String EventDetails;

    public Event(String eventName, String eventId) {
        this.EventName = eventName;
        this.EventId = eventId;
    }

    public void displayEventInfo() {
        System.out.println("Event Name: " + EventName + ", Event ID: " + EventId);
    } 
    
    public void EventDetails() {
        System.out.println("Details of Event: " + EventDetails);
    }
}
