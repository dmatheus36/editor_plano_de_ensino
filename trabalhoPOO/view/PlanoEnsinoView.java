package view;

import java.util.*;
import model.*;

public class PlanoEnsinoView {
    private Model model;
    private PlanoEnsinoController controller;
    private ArrayList<PlanoDeEnsino> pl = new ArrayList<PlanoDeEnsino>();
    private boolean finalizar = false;
    Scanner sc = new Scanner(System.in);

    void finalizarSistema() {
        finalizar = true;
    }

    public void init(Model model) {
        if (model != null) {
            this.model = model;
            controller = new PlanoEnsinoController();
            controller.init(model, this);
            menuPlanoEnsino();
        }
    }

    public void menuPlanoEnsino() {
        
        do {
            if ((model.getUsuario() != null) && model.getUsuario().getClass().getName() == "model.Professor") {
                String opcoes[] = {"[1] - Listar todos os planos de ensino", "[2] - Criar plano de ensino", "[3] - Excluir plano de ensino", "[4] - Sair"};

                System.out.println(opcoes[0]);
                System.out.println(opcoes[1]);
                System.out.println(opcoes[2]);
                System.out.println(opcoes[3]);
                System.out.println();

                System.out.print("Digite a opcao desejada: ");
                String event = sc.nextLine();
                controller.handleEvent(event);
            } else {
                String opcoes[] = {"[1] - Visualizar planos de ensino", "[2] - Sair"};

                System.out.println(opcoes[0]);
                System.out.println(opcoes[1]);
                System.out.println();

                System.out.print("Digite a opcao desejada: ");
                String event = sc.nextLine();
                controller.handleEvent(event);
            }
        } while(!finalizar);
    }

    public void listarPlanosEnsino() {
        int opcao = 0;
        int i = 0;
        if (model.getPlanoEnsinoAll().isEmpty()) {
            System.out.printf("%nNão existem planos de ensino cadastrados!");
            sc.nextLine();
            return;
        } else {
            pl = new ArrayList<PlanoDeEnsino>(model.getPlanoEnsinoAll().values());
            for (PlanoDeEnsino p : pl) {
                System.out.printf("[%d] - %s, %s%n", i+1, p.getCurso(), p.getProfessor().getNome());
                i++;
            }
        }

        System.out.print("Selecione um plano de ensino: ");
        opcao = sc.nextInt();
        sc.nextLine();

        if (opcao > pl.size()) {
            System.out.println("Opção inválida");
            return;
        }

        mostrarPlanoEnsino(pl.get(opcao-1));
    }

    public PlanoDeEnsino listarPlanosEnsino(String n) {
        String opcao = "";
        int event = 0;
        int i = 0;
        if (model.getPlanoEnsinoAll().isEmpty() && n != "3") {
            System.out.printf("%n%nNão existem planos de ensino");
            sc.nextLine();
            return null;
        }

        if (model.getUsuario().getCodigosDisciplina().isEmpty()) {
            System.out.println("Não existem planos de ensino associados a esse professor");
        }
        pl = new ArrayList<PlanoDeEnsino>(model.getPlanoEnsinoAll().values());
        for (PlanoDeEnsino p : pl) {
        System.out.printf("[%d] - %s, %s%n", i+1, p.getCurso(), p.getProfessor().getNome());
        i++;
        }  
        

        System.out.print("Selecione um plano de Ensino: ");
        event = sc.nextInt();
        sc.nextLine();

        if (event > pl.size()) {
            System.out.println("Numero inválido");
            return null;
        }
        if (n != "3" ) {
            if (model.getUsuario().getLogin().compareTo(pl.get(event-1).getProfessor().getLogin()) != 0) {
                mostrarPlanoEnsino(pl.get(event-1));
            } else if (n == "3" && model.getPlanoEnsinoAll().isEmpty()) {
                System.out.printf("%n%nNão existem planos de ensino para excluir");
                sc.nextLine();
            } else {
                opcao = menu2(pl.get(event-1));

                controller.handleEvent(opcao, pl.get(event-1));
            }
        }
        

        return pl.get(event-1);
    }

    public String menu2(PlanoDeEnsino p) {
        String op = "";
        String[] opcoes = {"[1] - Mostrar", "[2] - Editar", "[3] - Excluir"};

        for (int i = 0; i < opcoes.length; i++) {
            System.out.println(opcoes[i]);
        }

        System.out.println();

        System.out.print("Escolha uma opção: ");
        op = sc.nextLine();
        return op;
    }

    public void mostrarPlanoEnsino(PlanoDeEnsino p) {
        System.out.println(p);
        sc.nextLine();
    }
}
