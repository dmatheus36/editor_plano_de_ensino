package model;

import java.util.ArrayList;

public class Bibliografia {
    private String livro;
    private ArrayList<String> autores = new ArrayList<String>();
    private int edicao;
    private String ISBN;
    private String editora;
    private int ano;

    public Bibliografia() {
        super();
    }

    public Bibliografia(String livro, String autores, int edicao, String ISBN, String editora, int ano) {
        setLivro(livro);
        addAutor(autores);
        setEdicao(edicao);
        setEditora(editora);
        setISBN(ISBN);
        setAno(ano);
    }
    public String getLivro() {
        return livro;
    }    

    public void setLivro(String livro) {
        if (livro != null) {
            this.livro = livro;
        }
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public void addAutor(String autor) {
        if (autor != null) {
            autores.add(autor);
        }
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        if (edicao != 0) {
            this.edicao = edicao;
        }
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        if (ISBN != null) {
            this.ISBN = ISBN;
        }
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        if (editora != null) {
            this.editora = editora;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano != 0) {
            this.ano = ano;
        }
    }

    public String definirNome(String nome) {
        String s = "";
        String aux = "";
        int contEspaco = 0;
        
        aux += Character.toUpperCase(nome.charAt(0)) + ".";

        for (int i = 0; i < nome.length(); i++) {
            if (nome.charAt(i) == ' ') {
                contEspaco++;
            }
        }

        for (int i = 0, j = 0; j < contEspaco; i++) {
            if (nome.charAt(i) == ' ') {
                j++;
                if (j != contEspaco)
                    aux += Character.toUpperCase(nome.charAt(i+1)) + ".";
            }

            if (j == contEspaco) {
                s += nome.substring(i+1, nome.length()) + ", ";
            }
        }
        s += aux;

        return s;
    }

    public String toString() {
        String bibliografia = "";

        for (String a : autores) {
            if (autores.size() == 1) {
                bibliografia += definirNome(a);
            } else {
                bibliografia += definirNome(a) + "; ";
            }
        }
        if (!bibliografia.endsWith("."))
            bibliografia += ". ";

        bibliografia += " " + getLivro() + ".";   
        
        bibliografia += String.format(" %d ed.", getEdicao());

        bibliografia += " " + getEditora() + ", ";

        bibliografia += String.format("%d. ", getAno());

        bibliografia += String.format("ISBN: %s", getISBN());

        return bibliografia;
    }
}
