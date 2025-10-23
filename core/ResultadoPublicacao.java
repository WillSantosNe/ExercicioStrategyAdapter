package core;

public class ResultadoPublicacao {
    private boolean sucesso;
    private String idPublicacao;
    private String url;

    public ResultadoPublicacao(boolean sucesso, String idPublicacao, String url) {
        this.sucesso = sucesso;
        this.idPublicacao = idPublicacao;
        this.url = url;
    }

    @Override
    public String toString() {
        return "ResultadoPublicacao{" +
                "sucesso=" + sucesso +
                ", idPublicacao='" + idPublicacao + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
