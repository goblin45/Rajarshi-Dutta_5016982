interface Notifier {
    void send(String message);
}

class EmailNotifier implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}

abstract class NotifierDecorator implements Notifier {
    private Notifier notifier;
    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }
}

class SMSNotifier extends NotifierDecorator {

    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }
    @Override
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}

class SlackNotifier extends NotifierDecorator {

    public SlackNotifier(Notifier notifier) {
        super(notifier);
    }
    @Override
    public void send(String message) {
        System.out.println("Slack: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifier(emailNotifier);
        Notifier slackNotifier = new SlackNotifier(smsNotifier);
        
        emailNotifier.send("Hello World!");  // Sends via Email
        smsNotifier.send("Hello World!");    // Sends via SMS
        slackNotifier.send("Hello World!");  // Sends via Slack
    }
}

/*

Output:

Email: Hello World!
SMS: Hello World!
Slack: Hello World!

*/