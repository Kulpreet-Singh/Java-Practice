public class Message {
    private String sender;
    private String message;
    private String timestamp;

    public Message(String sender, String message, String timestamp){
        this.sender = sender;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getTimestamp(){
        return timestamp;
    }

    public String getMessage(){
        return message;
    }

    public String getSender(){
        return sender;
    }


}
