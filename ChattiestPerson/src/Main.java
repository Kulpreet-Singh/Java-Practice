import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Message> messages = List.of(
            new Message("Alice", "Hello Bob", "2021-08-01T13:00:00"),
            new Message("Bob", "Hi Alice. How are you?", "2021-08-01T13:01:00"),
            new Message("Alice", "I am good. How are you?", "2021-08-01T13:02:00"),
            new Message("Bob", "I am good too", "2021-08-01T13:03:00"),
            new Message("Alice", "That's great to hear", "2021-08-01T13:04:00"),
            new Message("Bob", "Yes it is", "2021-08-01T13:05:00"),
            new Message("Alice", "I have to go now. Bye", "2021-08-01T13:06:00"),
            new Message("Bob", "Bye", "2021-08-01T13:07:00")
        );

        GrantTitleChattiest grantTitleChattiest = new GrantTitleChattiest();

        for(Message message : messages){
//            System.out.println(message.getSender() + " said: " + message.getMessage() + " at " + message.getTimestamp());
            grantTitleChattiest.processMessage(message);
        }

        System.out.println("Chattiest person is: " + grantTitleChattiest.getChattiestPerson());
    }
}