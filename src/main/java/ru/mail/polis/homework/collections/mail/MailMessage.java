package ru.mail.polis.homework.collections.mail;

/**
 * 1 тугрик
 */
public class MailMessage extends Mail {
    private final String message;

    public MailMessage(String sender, String recipient, String message) {
        super(sender, recipient);
        this.message = message;
    }

    @Override
    public String toString() {
        return super.toString() + "Message - \"" + message + ".\"";
    }
}
