package br.com.music.principal;

import br.com.music.modelos.Musica;
import br.com.music.modelos.Podcasts;
import br.com.music.modelos.Preferencias;

public class Principal {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("Never say never");
        musica1.setArtista("Justin Bieber");

        for (int i = 0; i < 100; i++) {
            musica1.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica1.curtir();
        }

        Podcasts podPaulo = new Podcasts();
        podPaulo.setTitulo("PodPaulo");
        podPaulo.setHost("Paulo");

        for (int i = 0; i < 5000; i++) {
            podPaulo.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podPaulo.curtir();
        }

        Preferencias preferencias = new Preferencias();
        preferencias.inclui(podPaulo);
        preferencias.inclui(musica1);

    }
}
