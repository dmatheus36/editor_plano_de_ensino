package model;

import java.util.ArrayList;

public class PlanoDeEnsino {
    private String anoSemestre;
    private String nomeDisciplina;
    private String estruturaCurricular;
    private String codigoDisciplina;
    private String caraterDisciplina;
    private String regimeOfertaDisciplina;
    private String chTotal;
    private String chTeorica;
    private String chPratica;
    private String chEAD;
    private String chExtensao;
    private Professor professor;
    private String unidade;
    private String curso;
    private String preRequisitos;
    private String coRequisitos;
    private String equivalencias;
    private String justificativa;
    private String ementa;
    private ArrayList<String> objetivos = new ArrayList<String>();
    ArrayList<CalendarioAtividades> calendarioAtividades = new ArrayList<CalendarioAtividades>();
    private String metodologiaEnsino;
    private ArrayList<String> atividadeDiscente  = new ArrayList<String>();
    private String sistemaAvaliacao;
    private ArrayList<Bibliografia> bibliografia = new ArrayList<Bibliografia>();

    public PlanoDeEnsino() {
        super();
        setAnoSemestre("---");
        setNomeDisciplina("---");
        setEstruturaCurricular("---");
        setCodigoDisciplina("---");
        setCaraterDisciplina("---");
        setRegimeOfertaDisciplina("---");
        setChTotal("---");
        setChTeorica("---");
        setChPratica("---");
        setChEAD("---");
        setChExtensao("---");
        setUnidade("---");
        setPreRequisitos("---");
        setCoRequisitos("---");
        setEquivalencias("---");
        setJustificativa("---");
        setEmenta("---");
        setSistemaAvaliacao("---");
        setMetodologiaEnsino("---");


    }

    

    public String getEstruturaCurricular() {
        return estruturaCurricular;
    }



    public void setEstruturaCurricular(String estruturaCurricular) {
        this.estruturaCurricular = estruturaCurricular;
    }



    public String getCaraterDisciplina() {
        return caraterDisciplina;
    }



    public void setCaraterDisciplina(String caraterDisciplina) {
        this.caraterDisciplina = caraterDisciplina;
    }



    public String getRegimeOfertaDisciplina() {
        return regimeOfertaDisciplina;
    }



    public void setRegimeOfertaDisciplina(String regimeOfertaDisciplina) {
        this.regimeOfertaDisciplina = regimeOfertaDisciplina;
    }



    public String getChTotal() {
        return chTotal;
    }



    public void setChTotal(String chTotal) {
        this.chTotal = chTotal;
    }



    public String getChTeorica() {
        return chTeorica;
    }



    public void setChTeorica(String chTeorica) {
        this.chTeorica = chTeorica;
    }



    public String getChPratica() {
        return chPratica;
    }



    public void setChPratica(String chPratica) {
        this.chPratica = chPratica;
    }



    public String getChEAD() {
        return chEAD;
    }



    public void setChEAD(String chEAD) {
        this.chEAD = chEAD;
    }



    public String getChExtensao() {
        return chExtensao;
    }



    public void setChExtensao(String chExtensao) {
        this.chExtensao = chExtensao;
    }



    public String getCoRequisitos() {
        return coRequisitos;
    }



    public void setCoRequisitos(String coRequisitos) {
        this.coRequisitos = coRequisitos;
    }



    public String getEquivalencias() {
        return equivalencias;
    }



    public void setEquivalencias(String equivalencias) {
        this.equivalencias = equivalencias;
    }



    public String getAnoSemestre() {
        return anoSemestre;
    }

    public void setAnoSemestre(String anoSemestre) {
        this.anoSemestre = anoSemestre;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(String codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPreRequisitos() {
        return preRequisitos;
    }

    public void setPreRequisitos(String preRequisitos) {
        this.preRequisitos = preRequisitos;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public ArrayList<String> getObjetivos() {
        return objetivos;
    }

    public void addObjetivos(String objetivo) {
        objetivos.add(objetivo);
    }

    public void removeObjetivos() {
        objetivos.clear();
    }

    public ArrayList<CalendarioAtividades> getCalendarioAtividades() {
        return calendarioAtividades;
    }

    public void addCalendarioAtividades(CalendarioAtividades cal) {
        calendarioAtividades.add(cal);
    }

    public void removeCalendarioAtividades() {
        calendarioAtividades.clear();
    }

    public String getMetodologiaEnsino() {
        return metodologiaEnsino;
    }

    public void setMetodologiaEnsino(String metodologiaEnsino) {
        this.metodologiaEnsino = metodologiaEnsino;
    }

    public ArrayList<String> getAtividadeDiscente() {
        return atividadeDiscente;
    }

    public void addAtividadeDiscente(String at) {
        atividadeDiscente.add(at);
    }

    public void removeAtividadeDiscente() {
        atividadeDiscente.clear();
    }

    public String getSistemaAvaliacao() {
        return sistemaAvaliacao;
    }

    public void setSistemaAvaliacao(String sistemaAvaliacao) {
        this.sistemaAvaliacao = sistemaAvaliacao;
    }

    public ArrayList<Bibliografia> getBibliografia() {
        return bibliografia;
    }

    public void addBibliografia(Bibliografia b) {
        bibliografia.add(b);
    }

    public void removeBibliografia() {
        bibliografia.clear();
    }

    public String linha(int cont, String simbolo) {
        String linha = "";
        for (int i = 0; i < cont; i++) {
            linha += simbolo;
        }
        linha += "\n";

        return linha;
    }

    public String toString() {
        String planoEnsino = "";
        int cont = 100;
        for (int i = 0; i < cont; i++) {
            planoEnsino += "=";
        }
        planoEnsino += "\n";

        for (int i = 0, j = 0; i < cont; i++) {
            String s = "Plano de ensino de disciplina";
            int restEspaco = cont - s.length();
            if ((i < restEspaco / 2) || (i >= (s.length() + restEspaco/2))) {
                planoEnsino += " ";
            } else {
                planoEnsino += s.charAt(j);
                j++;
            }
        }
        planoEnsino += "\n";

        for (int i = 0; i < cont; i++) {
            planoEnsino += "=";
        }
        planoEnsino += "\n\n";

        for (int i = 0, j = 0; i < cont; i++) {
            String s = "Ano/Semestre";
            int restEspaco = cont - s.length();
            if ((i < restEspaco / 2) || (i >= (s.length() + restEspaco/2))) {
                planoEnsino += " ";
            } else {
                planoEnsino += s.charAt(j);
                j++;
            }
        }
        planoEnsino += "\n";

        for (int i = 0, j = 0; i < cont; i++) {
            String s = getAnoSemestre();
            int restEspaco = cont - s.length();
            if ((i < restEspaco / 2) || (i >= (s.length() + restEspaco/2))) {
                planoEnsino += " ";
            } else {
                planoEnsino += s.charAt(j);
                j++;
            }
        }
        planoEnsino += "\n\n";

        planoEnsino += linha(cont, "-");
        planoEnsino += " 1. Identificação\n";
        planoEnsino += String.format(" 1.1 Unidade: %s\n", getUnidade());
        planoEnsino += String.format(" 1.2 Cursos: %s\n", getCurso());
        planoEnsino += String.format(" 1.3 Estrutura curricular (ano-período): %s\n", getEstruturaCurricular());
        planoEnsino += String.format(" 1.4 Nome da disciplina: %s\n", getNomeDisciplina());
        planoEnsino += String.format(" 1.5 Código da disciplina: %s\n", getCodigoDisciplina());
        planoEnsino += String.format(" 1.6 Caráter da disciplina: %s\n", getCaraterDisciplina());
        planoEnsino += String.format(" 1.7 Regime de oferta da disciplina: %s\n", getRegimeOfertaDisciplina());
        planoEnsino += String.format(" 1.8 Carga horária\n");
        planoEnsino += String.format("  - CH Total: %s\n", getChTotal());
        planoEnsino += String.format("  - CH Teórica: %s\n", getChTeorica());
        planoEnsino += String.format("  - CH Prática: %s\n", getChPratica());
        planoEnsino += String.format("  - CH EAD: %s\n", getChEAD());
        planoEnsino += String.format("  - CH Extensão: %s\n", getChExtensao());
        planoEnsino += String.format(" 1.9 Pré-requisitos (quando houver): %s\n", getPreRequisitos());
        planoEnsino += String.format(" 1.10 Co-requisitos (quando houver): %s\n", getCoRequisitos());
        planoEnsino += String.format(" 1.11 Equivalências: %s\n", getEquivalencias());


        planoEnsino += linha(cont, "-");
        planoEnsino += " 2. Justificativa: \n";
        planoEnsino += linha(cont, "-");
        
        for (int i = 0, j = 0; i < getJustificativa().length(); i++) {
            if (j < cont-1) {
                planoEnsino += getJustificativa().charAt(i);
                j++;
            } else {
                planoEnsino += "-\n";
                j = 0;

            }
        }

        planoEnsino += "\n\n";

        planoEnsino += linha(cont, "-");
        planoEnsino += " 3. Ementa\n";
        planoEnsino += linha(cont, "-");
        for (int i = 0, j = 0; i < getEmenta().length(); i++) {
            if (j < cont-1) {
                planoEnsino += getEmenta().charAt(i);
                j++;
            } else {
                planoEnsino += "-\n";
                j = 0;

            }
        }
        planoEnsino += "\n\n";

        planoEnsino += linha(cont, "-");
        planoEnsino += " 4. Objetivos\n";
        planoEnsino += linha(cont, "-");
        for (int i = 0; i < objetivos.size(); i++) {
            planoEnsino += "    - ";
            planoEnsino += objetivos.get(i) + "\n";
        }
        planoEnsino += "\n\n";

        planoEnsino += linha(cont, "-");
        planoEnsino += " 5. Calendário de atividades\n";
        planoEnsino += linha(cont, "-");
        for (int i = 0, j = 0; i < cont; i++) {
            
            String[] s = {"Data", "Descrição do conteúdo", "Carga horária"};
            if (i == ((cont / 100) * 15) || (i == ((cont / 100) *75))) {
                planoEnsino += "|";
            } else if (i == (((cont / 100) * 15) / 2) || (i == (((cont / 100) * 50) -10)) || (i == (((cont / 100) * 75) +5))) {
                planoEnsino += s[j];
                i += s[j].length()-1;
                j++;
                
            } else {
                planoEnsino += " ";
            }
        }
        planoEnsino += "\n";
        for (CalendarioAtividades cal : calendarioAtividades) {
            for (int i = 0; i < cont; i++) {
                if (i == ((cont / 100) * 15) || (i == ((cont / 100) *75))) {
                    planoEnsino += "|";
                } else if (i == (((cont / 100) * 15) / 2)) {
                    planoEnsino += cal.getData();
                    i += cal.getData().length()-1;

                } else if ((i == (((cont / 100) * 50) -20))) {
                    planoEnsino += cal.getDescricaoConteudo();
                    i += cal.getDescricaoConteudo().length()-1;

                } else if ((i == (((cont / 100) * 75) +5))) {
                    planoEnsino += String.format("%dh", cal.getCargaHoraria());
                    
                } else {
                    planoEnsino += " ";
                }
            }
            planoEnsino += "\n";
        }
        
        planoEnsino += linha(cont, "-");
        planoEnsino += "\n\n";

        planoEnsino += linha(cont, "-");
        planoEnsino += " 6. Metodologia de ensino\n";
        planoEnsino += linha(cont, "-");

        for (int i = 0, j = 0; i < getMetodologiaEnsino().length(); i++) {
            if (j < cont-1) {
                planoEnsino += getMetodologiaEnsino().charAt(i);
                j++;
            } else {
                planoEnsino += "-\n";
                j = 0;

            }
        }
        planoEnsino += "\n\n";

        planoEnsino += linha(cont, "-");
        planoEnsino += " 7. Atividades discentes\n";
        planoEnsino += linha(cont, "-");

        for (String at : atividadeDiscente) {
            planoEnsino += "    - " + at + "\n";
        }

        planoEnsino += "\n\n";

        planoEnsino += linha(cont, "-");
        planoEnsino += " 8. Sistema de avaliação\n";
        
        for (int i = 0, j = 0; i < getSistemaAvaliacao().length(); i++) {
            if (j < cont-1) {
                planoEnsino += getSistemaAvaliacao().charAt(i);
                j++;
            } else {
                planoEnsino += "-\n";
                j = 0;

            }
        }
        planoEnsino += "\n\n";

        planoEnsino += linha(cont, "-");
        planoEnsino += "Bibliografia básica e complementar\n";
        planoEnsino += linha(cont, "-");

        for (Bibliografia b : bibliografia) {
            planoEnsino += b + "\n";
        }

        return planoEnsino;
    }
}
