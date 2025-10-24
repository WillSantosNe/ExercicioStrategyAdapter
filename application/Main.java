package application;

import core.Conteudo;
import core.ISocialMediaAdapter;
import core.ResultadoPublicacao;
import factory.SocialMediaFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("### GERENCIADOR DE MÍDIAS SOCIAIS ###\n");

        // --- Postando no Twitter ---
        System.out.println(">> Iniciando postagem no Twitter...");
        ISocialMediaAdapter twitterAdapter = SocialMediaFactory.criarAdapter("twitter");
        twitterAdapter.autenticar("minha-api-key-secreta", null);
        
        Conteudo tweet = new Conteudo("Olá mundo via meu sistema unificado! #Java #DesignPatterns", null);
        ResultadoPublicacao resultadoTweet = twitterAdapter.postar(tweet);
        System.out.println("Resultado da postagem: " + resultadoTweet);

        System.out.println("\n-----------------------------------------\n");

        // --- Postando no Instagram ---
        System.out.println(">> Iniciando postagem no Instagram...");
        ISocialMediaAdapter instagramAdapter = SocialMediaFactory.criarAdapter("instagram");
        instagramAdapter.autenticar("william_dev", "123456");

        Conteudo postInstagram = new Conteudo("Foto do meu setup de estudos! 💻", new byte[]{1,2,3}); 
        ResultadoPublicacao resultadoInstagram = instagramAdapter.postar(postInstagram);
        System.out.println("Resultado da postagem: " + resultadoInstagram);
    }
}
