package adapters;

import apis.InstagramApi;
import core.Conteudo;
import core.ISocialMediaAdapter;
import core.ResultadoPublicacao;

public class InstagramAdapter implements ISocialMediaAdapter {
    private InstagramApi instagramApi = new InstagramApi(); // O Adaptee
    private String usuario;
    private String senha;

    @Override
    public void autenticar(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
         System.out.println("Instagram Adapter: Credenciais armazenadas.");
    }

    @Override
    public ResultadoPublicacao postar(Conteudo conteudo) {
        if (usuario == null || usuario.isEmpty()) {
            return new ResultadoPublicacao(false, null, "Erro: Autenticação necessária.");
        }
        // O Adapter "traduz" a chamada
        String id = instagramApi.publishPost(usuario, senha, conteudo.getTexto(), conteudo.getImagem());
        String url = "https://instagram.com/p/" + id;
        return new ResultadoPublicacao(true, id, url);
    }
}
