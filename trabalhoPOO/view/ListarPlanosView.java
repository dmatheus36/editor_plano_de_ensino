package view;

import java.util.ArrayList;
import java.util.HashMap;

import model.*;

public class ListarPlanosView {
    private Model model;
    private ListarPlanosController controller;
    private ArrayList<PlanoDeEnsino> pl = new ArrayList<PlanoDeEnsino>();

    public void init(Model model) {
        this.model = model;
        controller = new ListarPlanosController();
        controller.init(model, this);
        listarPlanosEnsino();
    }

    public void init(Model model, Professor p) {
        this.model = model;
        controller.init(model, this);
        listarPlanosEnsino(p);
    }

    public void listarPlanosEnsino() {
        int c = 0;
        pl = new ArrayList<PlanoDeEnsino>(model.getPlanoEnsinoAll().values());
        for (PlanoDeEnsino p : pl) {
            System.out.printf("[%d] - %s, %s%n", c+1, p.getNomeDisciplina(), p.getProfessor().getNome());
            c++;
        }


    }

    public void listarPlanosEnsino(Professor p) {
        int i = 0;
        for (String c : p.getCodigosDisciplina()) {
            PlanoDeEnsino pl = model.getPlanosDeEnsino(c);
            System.out.printf("[%d] - %s, %s%n", i+1, pl.getNomeDisciplina(), pl.getProfessor().getNome());
        }
    }


}
