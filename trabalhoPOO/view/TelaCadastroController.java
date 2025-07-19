package view;

import model.*;

public class TelaCadastroController {
    private Model model;
    private TelaCadastroView view;

    public void init(Model model, TelaCadastroView view) {
        this.model = model;
        this.view = view;
    }

    public void handleEvent(String event) {
        if (view.getLogin() != null && view.getNome() != null && view.getSenha() != null) {
            Professor p = new Professor(view.getNome(), view.getLogin(), view.getSenha());
            model.setUsuario(p);
            view.setFinalizar(true);
            view.exibeMSG("Cadastro realizado");
        } else {
            view.setFinalizar(false);
            view.exibeMSG("Informações inválidas. Tente de novo");
        }
    }
}
