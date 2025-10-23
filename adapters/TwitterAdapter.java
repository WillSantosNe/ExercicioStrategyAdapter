package adapters;

import apis.TwitterApi;
import core.Conteudo;
import core.ISocialMediaAdapter;
import core.ResultadoPublicacao;

public class TwitterAdapter implements ISocialMediaAdapter {
    private TwitterApi twitterApi = new TwitterApi(); // O Adaptee
    private String apiKey;

    @Override
    public void autenticar(String usuario, String senha) {
        this.apiKey = usuario;
        System.out.println("Twitter Adapter: Chave de API armazenada.");
    }

    @Override
    public ResultadoPublicacao postar(Conteudo conteudo) {
        if (apiKey == null || apiKey.isEmpty()) {
            return new ResultadoPublicacao(false, null, "Erro: Autenticação necessária.");
        }
        // O Adapter "traduz" a chamada
        twitterApi.submitTweet(apiKey, conteudo.getTexto());
        String id = "tweet_" + System.currentTimeMillis();
        String url = "https://twitter.com/user/status/" + id;
        return new ResultadoPublicacao(true, id, url);
    }
}
