package model;

public class Bibliografia {
    private String livro;
    private String autor;
    private int edicao;
    private long ISBN;
    private String editora;
    private int ano;

    public Bibliografia(String livro, String autor, int edicao, long ISBN, String editora, int ano) {

    }

    public String getLivro() {
        return livro;
    }    

    public void setLivro(String livro) {
        if (livro != null) {
            this.livro = livro;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor != null) {
            this.autor = autor;
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

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        if (ISBN != 0) {
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

    public String toString() {
        return String.format("%s. %s. %d ed. %s, %d. ISBN: %d", getAutor(), getLivro(), getEdicao(), getEditora(), getAno(), getISBN());
    }
}
