package factory;

import adapters.InstagramAdapter;
import adapters.TwitterAdapter;
import core.ISocialMediaAdapter;

public class SocialMediaFactory {
    public static ISocialMediaAdapter criarAdapter(String plataforma) {
        if (plataforma == null || plataforma.isEmpty()) {
            throw new IllegalArgumentException("Plataforma não pode ser nula.");
        }

        switch (plataforma.toLowerCase()) {
            case "twitter":
                return new TwitterAdapter();
            case "instagram":
                return new InstagramAdapter();
            // case "linkedin":
            //     return new LinkedInAdapter();
            default:
                throw new IllegalArgumentException("Plataforma desconhecida: " + plataforma);
        }
    }
}
