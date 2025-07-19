package model;

import java.util.HashMap;
import java.util.ArrayList;
import view.*;

public class Model {
    private HashMap<String, PlanoDeEnsino> planosDeEnsino = new HashMap<String, PlanoDeEnsino>();
    private HashMap<String, Professor> usuarios = new HashMap<String, Professor>();
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private Professor usuarioAutenticado;

    


    private static Model instanciaUnica;

    private Model() {
        super();
    }

    public static Model getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Model();
        }

        return instanciaUnica;
    }

    public String getNomeUsuario(String login) {
        if (login != null) {
            Usuario usuario = usuarios.get(login);
            if (usuario != null) {
                return usuario.getNome();
            }
        }

        return "";
    }

    public void setUsuario(Professor u) {
        usuarios.put(u.getLogin(), u);
    }

    public boolean autenticarUsuario(String login, String senha) {
        Professor usuario;
        boolean autenticado = false;

        if (login != null && senha != null) {
            usuario = usuarios.get(login);
            if (usuario != null) {
                if (login.equals(usuario.getLogin()) && senha.equals(usuario.getSenha())) {
                    usuarioAutenticado = usuario;
                    autenticado = true;
                }
            }
        }

        return autenticado;
    }

    public void deslogarUsuario() {
        usuarioAutenticado = null;
    }

    public Professor getUsuarioAutenticado() {
        if (usuarioAutenticado != null) {
            return usuarioAutenticado;
        } else {
            return null;
        }
    }

    public Professor getUsuario() {
        return usuarioAutenticado;
    }

    public void atualizarBaseUser(Professor p) {
        usuarios.put(p.getLogin(), p);
        usuarioAutenticado = p;
    }

    public PlanoDeEnsino getPlanosDeEnsino(String chave) {
        return planosDeEnsino.get(chave);
    }

    public HashMap<String, PlanoDeEnsino> getPlanoEnsinoAll() {
        return planosDeEnsino;
    }

    public void addPlanoEnsino(PlanoDeEnsino p) {
        planosDeEnsino.put(p.getCodigoDisciplina(), p);
    }

    public void removePlanoEnsino(PlanoDeEnsino p) {
        planosDeEnsino.remove(p.getCodigoDisciplina());
    }

    public int getTotalUsuarios() {
        return usuarios.size();
    }

    public void notifica() {
        for (Observer o : observers) {
            o.update();
        }
    }

    public void attachObserver(Observer observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }

    public void detachObserver(Observer observer) {
        if (observer != null) {
            observers.remove(observer);
        }
    }
}
