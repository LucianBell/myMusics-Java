package br.com.alura.mymusics.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 8) {
            System.out.println(audio.getTitulo() + " é considerado um sucesso! Escute agora!");
        } else {
            System.out.println(audio.getTitulo() + " é uma ótima opção para mais tarde!");
        }
    }
}
