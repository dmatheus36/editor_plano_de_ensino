package view;

import model.*;

public class PlanoEnsinoController {
    private Model model;
    private PlanoEnsinoView view;
    private PlanoDeEnsino pl;

    public void init(Model model, PlanoEnsinoView view) {
        if (model != null && model != null) {
            this.model = model;
            this.view = view;
        }
    }

    public void handleEvent(String event) {
        if (model.getUsuario() != null && model.getUsuario().getClass().getName() == "model.Professor") {
            switch (event) {
                case "1":
                    view.listarPlanosEnsino(event);
                    break;

                case "2":
                    EditarPlanoEnsinoView view2 = new EditarPlanoEnsinoView();
                    view2.init(model);
                    break;
                case "3":
                    pl = view.listarPlanosEnsino(event);
                    if (pl != null) {
                        model.getUsuario().removeCodigosDisciplina(pl.getCodigoDisciplina());
                        model.removePlanoEnsino(pl);
                    }
                    
                    break;
                case "4":
                    view.finalizarSistema();
                    break;
            }
        } else {
            switch (event) {
                case "1":
                view.listarPlanosEnsino();
                case "2":
                    view.finalizarSistema();
                    break;
            }
        }
    }

    public void handleEvent(String event, PlanoDeEnsino p) {
        switch (event) {
            case "1":
                view.mostrarPlanoEnsino(p);
                break;

            case "2":
                EditarPlanoEnsinoView view2 = new EditarPlanoEnsinoView();
                view2.init(model, p);
                break;
            case "3":
                model.getUsuario().removeCodigosDisciplina(p.getCodigoDisciplina());
                model.removePlanoEnsino(p);
                break;
            default:
                break;
        }
    }
}
