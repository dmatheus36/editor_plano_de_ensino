package model;

import java.util.HashMap;
import java.util.ArrayList;
import view.*;

public class Model {
    private HashMap<String, PlanoDeEnsino> planosDeEnsino = new HashMap<String, PlanoDeEnsino>();
    private HashMap<String, Professor> professores = new HashMap<String, Professor>();
    private ArrayList<Observer> observers = new ArrayList<Observer>();


    private static Model instanciaUnica;

    private Model() {
        super();
    }

    public static Model getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Model();
        }

        return instanciaUnica;
    }
}
