package apis;

public class InstagramApi {
    public String publishPost(String user, String pass, String legenda, byte[] dadosDaImagem) {
        System.out.println("--------------------");
        System.out.println("Conectando no Instagram com usuário: " + user);
        if (dadosDaImagem != null) {
            System.out.println("Publicando imagem no INSTAGRAM com a legenda: '" + legenda + "'");
        } else {
             System.out.println("Publicando apenas texto no INSTAGRAM: '" + legenda + "'");
        }
        System.out.println("--------------------");
        //Coloquei um retorno aleatório
        return "insta_post_" + System.currentTimeMillis();
    }
}
