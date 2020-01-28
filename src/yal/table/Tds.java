package yal.table;

import yal.exceptions.AnalyseLexicaleException;
import yal.exceptions.DoubleDeclarationException;
import yal.exceptions.NotDeclaredException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Tds {
    private HashMap<Entree,Symbole> table;
    private int taille;
    private static final Tds instance=new Tds();
    public Tds(){
        table=new HashMap<>();
        taille=0;
    }
    public static Tds getInstance(){
        return  instance;
    }
    public void ajouter(EntreeVar e,SymboleEntier s) throws DoubleDeclarationException {
        table.put(e,s);
        taille=taille-4;
    }
    public Symbole identifier(Entree entree) throws NotDeclaredException {

        return table.get(entree);
    }
    public int getTailleZoneVariable(){
        return taille;
    }

}
