package Meb;

public abstract class AbstractChatroom {
    public abstract void reqister(Member member);
    public abstract void sendText(String from,String to,String message);
    public abstract void sendImage(String from,String to,String message);
}
