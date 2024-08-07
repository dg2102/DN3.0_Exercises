
public class Test {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Test email.");

        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        smsNotifier.send("Test email with SMS.");

        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);
        slackNotifier.send(" Test email with SMS and Slack.");
    }
    }
