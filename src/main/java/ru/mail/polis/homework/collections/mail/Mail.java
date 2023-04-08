package ru.mail.polis.homework.collections.mail;

/**
 * 1 тугрик
 */
public abstract class Mail {
    private final String sender;
    private final String recipient;

    public Mail(String sender, String recipient) {
        this.sender = sender;
        this.recipient = recipient;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }
    public String getContent() {
        return "";
    }

    @Override
    public String toString() {
        return "From " + sender + " to " + recipient + " : ";
    }
}
