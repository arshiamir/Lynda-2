package yal.exceptions;

public class DoubleDeclarationException extends AnalyseException {
    protected DoubleDeclarationException(int ligne,String m) {
        super("Erreur double declaration "+ ligne + "\n\t" + m + "\n");
    }
}
