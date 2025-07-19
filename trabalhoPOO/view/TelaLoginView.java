package view;

import java.util.*;
import model.*;

public class TelaLoginView implements Observer {
    private Model model;
    private TelaLoginController controller;
    private String login;
    private String senha;

    public void init(Model model) {
        this.model = model;
        controller = new TelaLoginController();
        controller.init(model, this);
        logarUsuario();
    }

    public void logarUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("           LOGIN       ");
        System.out.println("=======================");
        System.out.println();
        System.out.print("Login: ");
        login = sc.nextLine();
        System.out.print("Senha: ");
        senha = sc.nextLine();
        controller.handleEvent("OK");
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

    public void exibeMSG(String msg) {
		System.out.println();
		System.out.println(msg);
		System.out.println();
	}


    public void update() {

    }
}
