package view;

import java.util.*;

import model.*;

public class EditarPlanoEnsinoView {
    private Model model;
    private EditarPlanoEnsinoController controller;
    boolean finalizar = false;
    PlanoDeEnsino p = new PlanoDeEnsino();
    Scanner sc = new Scanner(System.in);


    public void init(Model model) {
        this.model = model;
        controller = new EditarPlanoEnsinoController();
        controller.init(model, this);

        menu();
    }

    public void init(Model model, PlanoDeEnsino pl) {
        this.model = model;
        controller = new EditarPlanoEnsinoController();
        controller.init(model, this);
        p = pl;
        menu();
    }

    public void menu() {
        String event = "";
        String opcoes[] = {"[1] - Nome do disciplina", "[2] - Ano/Semestre [0000.0]", "[3] - [Unidade]", "[4] - Estrutura curricular", "[5] - Código da disciplina", "[6] - Carater da disciplina", "[7] - Regime de Oferta da Disciplina", "[8] - Carga horária total", "[9] - Carga horária teórica", "[10] - Carga horária Prática", "[11] - Carga horária EAD", "[12] - Carga horária extensão", "[13] - Pré-requisitos", "[14] - Co-requisitos", "[15] - Equivalências: ", "[16] - Justificativa", "[17] - Ementa", "[18] - Objetivos", "[19] - Limpar Objetivos", "[20] - Adicionar aula", "[21] - Limpar Cronograma", "[22] - Metodologia de Ensino", "[23] - Atividades discentes", "[24] - Limpar Atividades Discentes", "[25] - Sistema de Avaliação", "[26] - Adicionar livro", "[27] - Limpar bibliográfia", "[28] - Visualizar Plano de Ensino", "[30] - Sair"};
        p.setProfessor(model.getUsuario());
        do {
            if (p.getNomeDisciplina() == null) {
                System.out.print("Inserir nome do curso: ");
                p.setNomeDisciplina(sc.nextLine());
            }

            for (int i = 0; i < opcoes.length; i++) {
                System.out.println(opcoes[i]);
            }
            
            System.out.println();
            System.out.print("Escolha a opcao desejada: ");
            event = sc.nextLine();
            controller.handleEvent(event);
        }while(!finalizar);
    }

    

    public PlanoDeEnsino getPlanoDeEnsino() {
        return p;
    }

    public String alteraComponente() {
        return sc.nextLine();
    }

    public void exibeMSG(String msg) {
        System.out.printf("%n%s: ", msg);
    }

    public CalendarioAtividades adicionarAula() {
        String descricaoConteudo = "";
        String data = "";
        int cargaHoraria = 0;
        System.out.printf("%n%nTítulo da Aula: ");
        descricaoConteudo = sc.nextLine();
        System.out.print("Data: ");
        data = sc.nextLine();
        System.out.print("Carga Horária: ");
        cargaHoraria = sc.nextInt();

        return new CalendarioAtividades(descricaoConteudo, data, cargaHoraria);
        
    }

    public Bibliografia adicionarLivro() {
        int cond = 0;
        String livro = "";
        String autores = "";
        int edicao = 0;
        String ISBN = "";
        String editora = "";
        int ano = 0;

        System.out.print("Nome do Livro: ");
        livro = sc.nextLine();
        
        System.out.print("Autor: ");
        autores = sc.nextLine();

        System.out.print("Edição: ");
        edicao = sc.nextInt();
        sc.nextLine();

        System.out.print("ISBN: ");
        ISBN = sc.nextLine();

        System.out.print("Editora: ");
        editora = sc.nextLine();

        System.out.print("Ano: ");
        ano = sc.nextInt();

        return new Bibliografia(livro, autores, edicao, ISBN, editora, ano);
    }

    public void mostrarPlanoEnsino() {
        System.out.println(p);
    }

    public void pause() {
        sc.nextLine();
    }
}
