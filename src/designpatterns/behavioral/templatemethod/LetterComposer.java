package designpatterns.behavioral.templatemethod;

public abstract class LetterComposer {
    public String compose(String recipient, String sender,String content) {
        return createHeader(recipient)
                + content
                + cerateFooter(sender);

    }

    protected abstract String cerateFooter(String sender);


    protected abstract String createHeader(String recipient);


}
