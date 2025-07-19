package view;

import model.*;

public class TelaPrincipalController implements Observer {
    private Model model;
    private TelaPrincipalView view;

    public void init(Model model, TelaPrincipalView view) {
        if (model != null && view != null) {
            this.model = model;
            this.view = view;
        }
    }

    public void handleEvent(String event) {
        switch (event) {
            case "1":
                if (model.getTotalUsuarios() == 0) {
                    view.exibeMSG("Não existem usuários cadastrados!");
                } else {
                    if (model.getUsuarioAutenticado() == null) {
                        TelaLoginView view3 = new TelaLoginView();
                        view3.init(model);
                }   else {
                        model.deslogarUsuario();
                }
                }
                
                break;

            case "2":
                TelaCadastroView view2 = new TelaCadastroView();
                view2.init(model);
                break;

            case "3":
                PlanoEnsinoView view4 = new PlanoEnsinoView();
                view4.init(model);
                break;
            
            case "4":
                view.finalizarSistema();
                break;
        
            default:
                break;
        }
    }



    public void update() {

    }
}
