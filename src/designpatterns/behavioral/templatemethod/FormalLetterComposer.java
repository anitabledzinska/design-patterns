package designpatterns.behavioral.templatemethod;

public class FormalLetterComposer extends LetterComposer {

    @Override
    protected String cerateFooter(String sender) {
        return "\n\nZ poważaniem,\n" + sender;
    }

    @Override
    protected String createHeader(String recipient) {
        return "Szanowny " + recipient + ", \n\n";
    }
}
