package view;

import model.*;

public class TelaLoginController {
    private Model model;
    private TelaLoginView view;
    
    public void init(Model model, TelaLoginView view) {
        if (model != null && view != null) {
            this.model = model;
            this.view = view;
        }
    }

    public void handleEvent(String event) {
        switch (event) {
		case "OK" :
			boolean autenticado = model.autenticarUsuario(view.getLogin(), view.getSenha());
			if (!autenticado) {
				view.exibeMSG("ERRO: Usuario e/ou Senha invalidos!");				
			} else {
                
				view.exibeMSG("SUCESSO: Usuario autenticado!");
			}
			break;
		}
    }
}
