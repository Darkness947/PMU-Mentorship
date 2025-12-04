public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the PMU Mentorship App!");
        System.out.println("---- Testing Mentee Account ----");

        Mentee mentee1 = new Mentee("202100321", "Mohammed", "Ali", "202100321@pmu.edu.sa", "password123", "Computer Science", 3.8);

        mentee1.login("202100321@pmu.edu.sa", "password123");

        System.out.println("---- Testing Mentor Account ----");

        Mentor mentor1 = new Mentor("201900213", "Majid", "Hassan", "Mhassan@pmu.edu.sa", "mentorpass", "Software Engineering");

        mentor1.login("Mhassan@pmu.edu.sa", "mentorpass");

        mentor1.createEvent("Java Programming Workshop");
        mentor1.getEvents();

    }
}
