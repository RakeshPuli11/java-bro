// Service class implementing both interfaces
public class NotificationService implements Notifier, Logger {

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Notification: " + message);
    }

    @Override
    public void logEvent(String event) {
        System.out.println("Logging Event: " + event);
    }
}

// this classs is sed to implement the implementation of the interfaces just like multiple inheritance

// In Spring Boot, the approach i've described aligns with the principles
//  of dependency injection and inversion of control (IoC) that Spring is built upon.

// When you define a service class in Spring, such as NotificationService, and it implements one or
//  more interfaces, Spring can manage and inject instances of that service into other components, like 
//  Main class. The Main class doesn't need to know the implementation details of NotificationService
//   – it only needs to know about the contract specified by the interfaces.