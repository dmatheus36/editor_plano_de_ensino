package view;

import model.*;

public class EditarPlanoEnsinoController {
    private Model model;
    private EditarPlanoEnsinoView view;

    public void init(Model model, EditarPlanoEnsinoView view) {
        this.model = model;
        this.view = view;
    }

    public void handleEvent(String event) {
        switch (event) {
            case "1":
                view.exibeMSG("Nome da disciplina: ");
                view.getPlanoDeEnsino().setCurso(view.alteraComponente());
                break;
            case "2":
                view.exibeMSG("Ano/Semestre: ");
                view.getPlanoDeEnsino().setAnoSemestre(view.alteraComponente());
                break;
            case "3":
                view.exibeMSG("Unidade: ");
                view.getPlanoDeEnsino().setUnidade(view.alteraComponente());
                break;
            case "4":
                view.exibeMSG("Estrutura Curricular: ");
                view.getPlanoDeEnsino().setEstruturaCurricular(view.alteraComponente());
            case "5":
                view.exibeMSG("Código da disciplina: ");
                view.getPlanoDeEnsino().setCodigoDisciplina(view.alteraComponente());
                break;
            case "6":
                view.exibeMSG("Caráter da Disciplina [Obrigatória/Optativa]");
                view.getPlanoDeEnsino().setCaraterDisciplina(view.alteraComponente());
                break;
            case "7":
                view.exibeMSG("Regime de Oferta da Disciplina");
                view.getPlanoDeEnsino().setRegimeOfertaDisciplina(view.alteraComponente());
                break;
            case "8":
                view.exibeMSG("Carga Horária Total: ");
                view.getPlanoDeEnsino().setChTotal(view.alteraComponente());
                break;
            case "9":
                view.exibeMSG("Carga Horária Teórica: ");
                view.getPlanoDeEnsino().setChTeorica(view.alteraComponente());
            case "10":
                view.exibeMSG("Carga Horária Prática: ");
                view.getPlanoDeEnsino().setChPratica(view.alteraComponente());
                break;
            case "11":
                view.exibeMSG("Carga Horária EaD: ");
                view.getPlanoDeEnsino().setChEAD(view.alteraComponente());
                break;
            case "12":
                view.exibeMSG("Carga Horária Extensão: ");
                view.getPlanoDeEnsino().setChExtensao(view.alteraComponente());
                break;
            case "13":
                view.exibeMSG("Pré-requisitos: ");
                view.getPlanoDeEnsino().setPreRequisitos(view.alteraComponente());
                break;
            case "14":
                view.exibeMSG("Co-requisitos: ");
                view.getPlanoDeEnsino().setCoRequisitos(view.alteraComponente());
                break;
            case "15":
                view.exibeMSG("Equivalências: ");
                view.getPlanoDeEnsino().setEquivalencias(view.alteraComponente());
                break;
            case "16":
                view.exibeMSG("Justificativa: ");
                view.getPlanoDeEnsino().setJustificativa(view.alteraComponente());
                break;
            case "17":
                view.exibeMSG("Ementa: ");
                view.getPlanoDeEnsino().setEmenta(view.alteraComponente());
                break;
            case "18":
                view.exibeMSG("Adicionar Objetivos: ");
                view.getPlanoDeEnsino().addObjetivos(view.alteraComponente());
                break;
            case "19":
                view.exibeMSG("Os objetivos foram excluidos%n");
                view.getPlanoDeEnsino().removeObjetivos();
                break;
            case "20":
                view.getPlanoDeEnsino().addCalendarioAtividades(view.adicionarAula());
                break;
            case "21":
                view.exibeMSG("As aulas foram excluídas%n");
                view.getPlanoDeEnsino().removeCalendarioAtividades();
                break;
            case "22":
                view.exibeMSG("Metodologia de Ensino: ");
                view.getPlanoDeEnsino().setMetodologiaEnsino(view.alteraComponente());
                break;
            case "23":
                view.exibeMSG("Adicionar Atividades Discentes: ");
                view.getPlanoDeEnsino().addAtividadeDiscente(view.alteraComponente());
                break;
            case "24":
                view.exibeMSG("As Atividades discentes foram excluídas%n");
                view.getPlanoDeEnsino().removeAtividadeDiscente();
                break;
            case "25":
                view.exibeMSG("Sistema de Avaliação: ");
                view.getPlanoDeEnsino().setSistemaAvaliacao(view.alteraComponente());
                break;
            case "26":
                view.getPlanoDeEnsino().addBibliografia(view.adicionarLivro());
                break;
            case "27":
                view.getPlanoDeEnsino().removeBibliografia();
                break;
            case "28":
                view.mostrarPlanoEnsino();
                view.pause();
                break;
            case "30":
                view.getPlanoDeEnsino().getProfessor().addCodigosDisciplina(view.getPlanoDeEnsino().getCodigoDisciplina());
                model.addPlanoEnsino(view.getPlanoDeEnsino());

                view.finalizar = true;
            default:
                break;
        }
    }
}
