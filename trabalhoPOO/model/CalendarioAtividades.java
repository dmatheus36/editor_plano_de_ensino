package model;

public class CalendarioAtividades {
    private String descricaoConteudo;
    private String data;
    private int cargaHoraria;

    public CalendarioAtividades(String descricaoConteudo, String data, int cargaHoraria) {
        setDescricaoConteudo(descricaoConteudo);
        setData(data);
        setCargaHoraria(cargaHoraria);
    }

    public String getDescricaoConteudo() {
        return descricaoConteudo;
    }

    public void setDescricaoConteudo(String descricaoConteudo) {
        this.descricaoConteudo = descricaoConteudo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    
}
