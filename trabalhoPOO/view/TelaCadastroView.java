package view;

import java.util.Scanner;

import model.*;

public class TelaCadastroView {
    private Model model;
    private TelaCadastroController controller;
    private Usuario usuario;
    private String nome;
    private String login;
    private String senha;
    private String ocupacao;
    private boolean finalizar = false;
    Scanner sw = new Scanner(System.in);

    public void init(Model model) {
        this.model = model;
        controller = new TelaCadastroController();
        controller.init(model, this);
        cadastrarUsuario();
    }

    public void cadastrarUsuario() {
        
        System.out.println("TELA CADASTRAR USUARIO");
        System.out.println("======================");
        System.out.println();
        System.out.print("Nome: ");
        nome = sw.nextLine();
        System.out.print("Login: ");
        login = sw.nextLine();
        System.out.print("Senha: ");
        senha = sw.nextLine();
        System.out.print("Ocupacao: ");
        ocupacao = sw.nextLine();
        controller.handleEvent("OK");
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario u) {
        this.usuario = u;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public boolean isFinalizar() {
        return finalizar;
    }

    public void setFinalizar(boolean finalizar) {
        this.finalizar = finalizar;
    }

    public void exibeMSG(String msg) {
		System.out.println();
		System.out.println(msg);
		System.out.println();
	}
}
