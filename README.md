PROJETO: SISTEMA DE GERENCIAMENTO DE MÍDIAS SOCIAIS

Descrição: Este projeto implementa um sistema unificado para postar conteúdo em múltiplas redes sociais, como Twitter e Instagram. O objetivo é criar uma interface única que esconde a complexidade e as diferenças das APIs de cada plataforma.

Padrões de Projeto Utilizados: Adapter: Conecta as APIs incompatíveis das redes sociais (TwitterApi, InstagramApi) a uma interface única e compatível no nosso sistema (ISocialMediaAdapter).

Strategy: Cada adapter (TwitterAdapter, InstagramAdapter) funciona como uma estratégia diferente para a publicação. O sistema usa a estratégia correta dependendo da plataforma escolhida.

Factory Method: A classe SocialMediaFactory é usada para criar o adapter (a estratégia) correto de forma dinâmica, sem que o código principal precise saber os detalhes de cada um.
