import java.util.HashMap;
import java.util.Map;

public class GrantTitleChattiest {

    Double weightageNoOfMessages = 0.5; // to be adjusted 0-1
    Double weightageNoOfWords = 0.5; // to be adjusted 0-1
    Double weightageSpamMessages = 0.5; // to be adjusted 0-1

    // sender vs count of messages
    Map<String, Integer> messagesSentByPerson = new HashMap<>();

    // sender vs words spoken
    Map<String, Integer> wordsSpokenByPerson = new HashMap<>();

    Map<String, Map<String, Integer>> spamMessageCountBySender = new HashMap<>();

    // Todo: Do the processing of the message to assign chattiest person

    public void processMessage(Message msg){
        String sender = msg.getSender();
        String message = msg.getMessage();
        String timestamp = msg.getTimestamp();

        messagesSentByPerson.put(sender, messagesSentByPerson.getOrDefault(sender, 0) + 1);
        wordsSpokenByPerson.put(sender, wordsSpokenByPerson.getOrDefault(sender, 0) + message.split(" ").length);

        Map<String, Integer> senderMessageCount = spamMessageCountBySender.getOrDefault(sender, new HashMap<>());
        senderMessageCount.put(message, senderMessageCount.getOrDefault(message, 0) + 1);
        spamMessageCountBySender.put(sender, senderMessageCount);

    }

    public String getChattiestPerson(){
        String chattiestPerson = "";
        Double maxValue = 0.0;
        for(Map.Entry<String, Integer> entry : messagesSentByPerson.entrySet()){
            String sender = entry.getKey();
            Integer messagesSent = entry.getValue();
            Integer wordsSpoken = wordsSpokenByPerson.get(sender);
            Double score = messagesSent * weightageNoOfMessages + wordsSpoken * weightageNoOfWords
                    - spamMessageCountBySender.get(sender).size() * weightageSpamMessages;
            if(score > maxValue){
                chattiestPerson = sender;
                maxValue = score;
            }
        }
        return chattiestPerson;
    }

}
