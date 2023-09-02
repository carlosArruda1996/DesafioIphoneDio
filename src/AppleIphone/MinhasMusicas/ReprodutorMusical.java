package AppleIphone;

import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {
    private int volume = 10;

    private boolean reproduzindoMusica;
    private List<Musicas> listaMusicas = new ArrayList<>();

    int faixaAtual(){
        return listaMusicas.indexOf(this);
    }
    void novaMusica(String musica){
        if(!listaMusicas.contains(musica)){
            Musicas musicas = new Musicas();
            musicas.addMusica(musica);
        }else{
            throw new IllegalArgumentException("A musica já existe na sua playlist!!");
        }

    }

    void excluirMusica(Musicas musica){
        if(listaMusicas.contains(musica)){
            Musicas musicas = new Musicas();
            musicas.removerMusica(musica);
        }else{
            throw new IllegalArgumentException("A musica não existe na sua playlist!!");
        }

    }

    void tocarMusicas(String musica){
        if(musica.equalsIgnoreCase(String.valueOf((musica)))){
            reproduzindoMusica = true;
            System.out.println("Tocando musica: " + faixaAtual());
        }else{
            throw new IllegalArgumentException("Escolha uma faixa válida!!");
        }
    }
    void pausarMusica(){
        if(reproduzindoMusica = true){
            System.out.println("Musica pauzada!");
        }
    }

    int proximaFaixa(){
        System.out.println("Pulando para proxima musica");
    }

    void faixaAnterior(){
        System.out.println("Voltando para faixa anterior");
    }

    void aumentarVolume(){
        if(volume >= 0 && volume <= 30){
            volume++;
            System.out.println("Volume atual: " + volume);
        }else{
            System.out.println("O volume está no máximo");
        }
    }

    void diminuirVolume(){
        if(volume >= 0 && volume <= 30){
            volume--;
            System.out.println("Volume atual: " + volume);
        }else{
            System.out.println("O volume está no minimo");
        }
    }
}
