package view;

import java.util.*;
import model.*;

public class TelaPrincipalView implements Observer {
    private Model model;
    private TelaPrincipalController controller;
    private int totalUsers;
    private Usuario usuarioLogado;
    private boolean finalizar = false;
    Scanner sc = new Scanner(System.in);

    public void finalizarSistema() {
        finalizar = true;
    }

    public void init(Model model) {
        if (model != null) {
            this.model = model;
            controller = new TelaPrincipalController();
            controller.init(model, this); 
            model.attachObserver(this);
            menuPrincipal();
        }
    }

    public void menuPrincipal() {
        
        String event = "";

        String opcoes[] = {"[1] - Fazer Login", "[2] - Fazer cadastro", "[3] - Planos de ensino", "[4] - Sair"};
        
        do {
            System.out.println("=========================");
            System.out.println("EDITOR DE PLANO DE ENSINO");
            System.out.println("=========================");
            System.out.println();

            if (model.getUsuarioAutenticado() != null) {
                System.out.println("Usuario ativo: " + model.getUsuarioAutenticado().getNome());
                opcoes[0] = "[1] - Fazer Logout";
            } else {
                opcoes[0] = "[1] - Fazer login";
            }

            System.out.println();
            System.out.println(opcoes[0]);
            System.out.println(opcoes[1]);
            System.out.println(opcoes[2]);
            System.out.println(opcoes[3]);
            System.out.println();

            System.out.print("Digite a opção desejada: ");
            event = sc.nextLine();
            controller.handleEvent(event);
        } while (!finalizar);
    }

    public void exibeMSG(String msg) {
		System.out.println();
		System.out.println(msg);
		System.out.println();
        sc.nextLine();
	}

    public void update() {
        
    }
}
