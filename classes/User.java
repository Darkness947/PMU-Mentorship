public abstract class User {
    protected String PMUiD;
    protected String FirstName;
    protected String LastName;
    protected String Email;
    protected String Password;
    
    public abstract void getEvents();

    public void getNode(String nodeID) {
        System.out.println("Getting node with ID: " + nodeID);
    }

    public void getRewards() {
        System.out.println("Getting rewards for user: " + PMUiD);
    }

}
