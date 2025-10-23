package core;

public class Conteudo {
    private String texto;
    private byte[] imagem;

    public Conteudo(String texto, byte[] imagem) {
        this.texto = texto;
        this.imagem = imagem;
    }

    // Getters
    public String getTexto() { return texto; }
    public byte[] getImagem() { return imagem; }
}
