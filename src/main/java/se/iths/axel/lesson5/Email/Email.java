package se.iths.axel.lesson5.Email;

public class Email {

    // Class variables
    private String to;
    private String from;
    private String subject;
    private String message;
    private String cc;


    public void email() {


        // Setters Getters
    }

    public void getTo(String to) {
        this.to = to;
    }

    public String setTo() {
        return to;
    }

    public void getFrom(String from) {
        this.from = from;
    }

    public String setFrom() {
        return from;
    }

    public void getSubject(String subject) {
        this.subject = subject;
    }

    public String setSubject() {
        return subject;
    }

    public void getMessage(String message) {
        this.message = message;
    }

    public String setMessage() {
        return message;
    }

    public void getCc(String cc) {
        this.cc = cc;
    }

    public String setCc() {
        return cc;
    }


}
