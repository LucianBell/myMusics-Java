package br.com.alura.mymusics.principal;

import br.com.alura.mymusics.modelos.Music;
import br.com.alura.mymusics.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {
        Music myMusic = new Music();

        myMusic.setTitulo("Tornado of Souls");
        myMusic.setCantor("Megadeth");

        for (int i = 0; i < 1000; i++) {
            myMusic.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.curtir();
        }

        Podcast myPodcast = new Podcast();

        myPodcast.setTitulo("Flow");
        myPodcast.setHost("Igor3K");
        myPodcast.setDescricao("Um podcast legal :D");

        for (int i = 0; i < 1000; i++) {
            myPodcast.reproduzir();
        }

        for (int i = 0; i < 500; i++) {
            myPodcast.curtir();
        }
        
    }

}
