package model;

import java.util.ArrayList;

public class PlanoDeEnsino {
    private String anoSemestre;
    private String nomeDisciplina;
    private String estruturaCurricular;
    private String codigoDisciplina;
    private String caraterDisciplina;
    private String regimeOfertaDisciplina;
    private int chTotal;
    private int chTeorica;
    private int chPratica;
    private int chEAD;
    private int chExtensao;
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
        setAnoSemestre("2025.1");
        setUnidade("Campus Russas");
        setCurso("Ciência da Computação e Engenharia de software");
        setNomeDisciplina("Programação orientada a objetos");
        setCodigoDisciplina("RUS0006");
        setJustificativa("O estudo das técnicas de programação constitui uma componente fundamental no aprendizado de engenharia de sistemas de software. É através da programação que os sistemas de software tornam-se produtos operacionais, passíveis de uso e comercialização. A Orientação a Objetos é um paradigma de programação maduro e largamente utilizado tanto na indústria quanto na academia. Um programa orientado a objetos é uma abstração do mundo real implementado através de um conjunto de objetos que interagem entre si para resolver, no universo computacional, um problema ou conjunto de problemas de um domínio de aplicação. Por esse motivo, o aprendizado das técnicas de programação orientada a objetos e, concomitantemente, a aplicação desse aprendizado através de uma linguagem de programação orientada a objetos, observando as boas práticas de desenvolvimento, torna-se uma necessidade e um fator diferencial.");
        setEmenta("Introduzir o paradigma de Programação Orientada a Objetos (OO), juntamente com seus conceitos de classes, objetos, herança, encapsulamento e polimorfismo, além dos conceitos de Interfaces e exceções que são inerentes às linguagens de programação orientadas a objetos. Desenvolvimento de um pequeno sistema baseados no paradigma de programação OO.");
        addObjetivos("Compreender os princípios da Orientação a Objetos");
        addObjetivos("Compreender o paradigma da Programação Orientada a Objetos.");
        addObjetivos("Desenvolver programas orientados a objetos em uma linguagem de programação (Java);");
        addObjetivos("Entender noções básicas de reuso através de herança e biblioteca de classes;");
        addObjetivos("Entender o conceito de separação de interesses e modularidade através do encapsulamento;");
        addCalendarioAtividades(new CalendarioAtividades("Introdução a POO e à linguagem Java", "31/03", 2));
        addCalendarioAtividades(new CalendarioAtividades("Definindo Características dos Objetos", "07/04", 2));
        setMetodologiaEnsino("O conteúdo das aulas será ministrado presencialmente, com a utilização de quadro branco, pincéis, projetor e vídeos (quando necessários). Serão disponibilizados os seguintes materiais didáticos de apoio: vídeos, slides e listas de exercícios on-line. Os livros continuam sendo o principal material de apoio. Serão usados exemplos práticos e exercícios de fixação do conhecimento, principalmente nas aulas práticas. Também será adotado o uso de sala de aula invertida, simulação e gameficação, com utilização do Ambiente Multimeios de Ensino-Aprendizagem (AME), disponível em https://ame2.russas.ufc.br e ferramentas de Inteligência Artificial (IA), disponíveis na internet. As atividades contidas no AME contarão com questões objetivas e questões de codificação com correção automática pela plataforma. Todo e qualquer tipo de material da disciplina será disponibilizado no AME, assim como a realização das atividades on-line (individuais e em grupo). Os instrumentos avaliativos (provas) serão aplicados de forma presencial (avalições teórica e prática). Quaisquer dúvidas adicionais, o professor pode ser contatado no seguinte e-mail institucional: marcos.vinicius@ufc.br ou em seu gabinete na Unidade I do Campus Russas da UFC. Também é possível contar com o apoio dos monitores da disciplina, de forma presencial em horários disponibilizados no AME e virtualmente, por meio do grupo da disciplina no WhatsApp e no Discord.");
        addAtividadeDiscente("Acompanhar o conteúdo (por meio do AME);");
        addAtividadeDiscente("Participar das aulas;");
        addAtividadeDiscente("Realizar os exercícios propostos (individuais e em grupo no AME);");
        addAtividadeDiscente("Realizar as avaliações e trabalhos;");
        addAtividadeDiscente("Realizar o acompanhamento de sua pontuação e frequência no SIGAA.");
        setSistemaAvaliacao("Conforme o Regimento Geral da UFC, a avaliação de rendimento do aluno far-se-á segundo os critérios de assiduidade e eficiência. Na verificação da assiduidade será aprovado o aluno que frequentar 75% (setenta e cinco por cento) ou mais da carga horária da disciplina, vedado o abono de faltas. A verificação da eficiência compreenderá, no mínimo, duas avaliações progressivas e uma avaliação final. Será aprovado por média o aluno que apresentar média aritmética das notas resultantes das avaliações progressivas igual ou superior a 07 (sete). O aluno que apresentar a média igual ou superior a 04 (quatro) e inferior a 07 (sete), será submetido à avaliação final. Nesse caso, o aluno será aprovado quando obtiver nota igual ou superior a 04 (quatro) na avaliação final e média final igual ou superior a 05 (cinco). A verificação do aprendizado será dividida em duas unidades, com as avaliações progressivas (AP1 e AP2), nas quais teremos a aplicação de alguns instrumentos: Provas (P1 – subdividida em P1_TEÓRICA e P1_PRÁTICA; e P2 – subdividida em P2_TEÓRICA e P2_PRÁTICA); Atividades em Grupo (AG1 e AG2) e Atividades Individuais (AI1 e AI2). As provas têm como objetivo avaliar a aprendizagem dos conceitos abordados por meio de questões objetivas e/ou abertas (duas provas teóricas), e questões de codificação em Java (duas provas prática). As atividades em grupo (realizadas por grupos de três até quatro pessoas), têm como objetivo trabalhar a interação entre os alunos, de modo que consigam aplicar os conceitos aprendidos por meio do desenvolvimento de soluções computacionais orientadas a objetos, e, ao final da disciplina, elaborem um pequeno sistema orientado a objetos. E os trabalhos individuais buscam aferir o aprendizado de cada participante da disciplina ao longo do semestre, permitindo a realização de intervenções individualizadas. As notas atribuídas em todas as verificações da aprendizagem seguem a padronização definida no Art. 111 do Regimento Geral da UFC, os resultados das verificações do rendimento serão expressos em notas na escala de 0 (zero) a 10 (dez), com, no máximo, uma casa decimal.");

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



    public int getChTotal() {
        return chTotal;
    }



    public void setChTotal(int chTotal) {
        this.chTotal = chTotal;
    }



    public int getChTeorica() {
        return chTeorica;
    }



    public void setChTeorica(int chTeorica) {
        this.chTeorica = chTeorica;
    }



    public int getChPratica() {
        return chPratica;
    }



    public void setChPratica(int chPratica) {
        this.chPratica = chPratica;
    }



    public int getChEAD() {
        return chEAD;
    }



    public void setChEAD(int chEAD) {
        this.chEAD = chEAD;
    }



    public int getChExtensao() {
        return chExtensao;
    }



    public void setChExtensao(int chExtensao) {
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

    public ArrayList<CalendarioAtividades> getCalendarioAtividades() {
        return calendarioAtividades;
    }

    public void addCalendarioAtividades(CalendarioAtividades cal) {
        calendarioAtividades.add(cal);
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
        planoEnsino += String.format("  - CH Total: %d\n", getChTotal());
        planoEnsino += String.format("  - CH Teórica: %d\n", getChTeorica());
        planoEnsino += String.format("  - CH Prática: %d\n", getChPratica());
        planoEnsino += String.format("  - CH EAD: %d\n", getChEAD());
        planoEnsino += String.format("  - CH Extensão: %d\n", getChExtensao());
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
