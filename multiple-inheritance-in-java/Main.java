public class Main{
    public static void main(String[] args) {
        Notifier n = new NotificationService();
        Logger l = new NotificationService();
        // since all the files required are in the same directory we can use the interfaces directly
        // i did not implement any kind of implementation for the interfaces
        // this is known as abstraction
        // this is how multiple inheritance like feature is used in java frameworks.
        n.sendNotification("sending bro");
        l.logEvent("logging bro");
    }
}
