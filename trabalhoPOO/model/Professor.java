package model;

import java.util.ArrayList;

public class Professor implements Usuario{
    private String nome;
    private String login;
    private String senha;
    private ArrayList<String> codigosDisciplina = new ArrayList<String>();

    public Professor(String nome, String login, String senha) {
        setNome(nome);
        setLogin(login);
        setSenha(senha);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

    public String getLogin() {
       return login;
    }

    public void setLogin(String login) {
        if (login != null) {
            this.login = login;
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha != null) {
            this.senha = senha;
        }
    }

    public ArrayList<String> getCodigosDisciplina() {
        return codigosDisciplina;
    }

    public void addCodigosDisciplina(String codigosDisciplina) {
        this.codigosDisciplina.add(codigosDisciplina);
    }

    public void removeCodigosDisciplina(String codigo) {
        
    }

    

}
