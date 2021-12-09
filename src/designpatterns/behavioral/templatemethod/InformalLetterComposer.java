package designpatterns.behavioral.templatemethod;

public class InformalLetterComposer extends LetterComposer {
    @Override
    protected String cerateFooter(String sender) {
        return "Pozdrowienia " + sender + ", \n\n";
    }

    @Override
    protected String createHeader(String recipient) {
        return "\n\nCześć " + recipient + ", \n\n";
    }
}
