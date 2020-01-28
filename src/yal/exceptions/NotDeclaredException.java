package yal.exceptions;

public class NotDeclaredException extends AnalyseException {
    protected NotDeclaredException(int ligne,String m) {
        super("Entree non declaree "+ligne + "\n\t" + m + "\n");
    }
}
