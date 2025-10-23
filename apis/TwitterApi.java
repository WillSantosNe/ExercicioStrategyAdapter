package apis;

public class TwitterApi {
    public void submitTweet(String apiKey, String texto) {
        System.out.println("--------------------");
        System.out.println("Autenticando com a API Key do Twitter...");
        System.out.println("Postando no TWITTER: '" + texto + "'");
        System.out.println("--------------------");
    }
}
