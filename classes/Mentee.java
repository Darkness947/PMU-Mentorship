public class Mentee extends User {
    private String Major;
    private double GPA;

    public Mentee(String pmuId, String firstName, String lastName, String email, String password, String major, double gpa) {
        this.PMUiD = pmuId;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Email = email;
        this.Password = password;
        this.Major = major;
        this.GPA = gpa;
        System.out.println("Account Created Successfully: Mentee " + this.FirstName + " " + this.LastName);
    }
   
    public boolean login(String inputEmail, String inputPassword) {
        if (this.Email.equals(inputEmail) && this.Password.equals(inputPassword)) {
            System.out.println("Login Successful! Welcome, mentee " + this.FirstName + ".");
            return true;
        } else {
            System.out.println("Login Failed: Invalid email or password.");
            return false;
        }
    }

    @Override
    public void getEvents() {
        System.out.println("Mentee " + this.PMUiD + " is browsing upcoming workshops.");
    }

    public String getMajor() {
        return Major;
    }
}
