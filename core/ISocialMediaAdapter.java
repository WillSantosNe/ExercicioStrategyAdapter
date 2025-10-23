package core;

public interface ISocialMediaAdapter {
    void autenticar(String usuario, String senha);
    ResultadoPublicacao postar(Conteudo conteudo);
    
}
