package AppleIphone;

import java.util.LinkedList;
import java.util.List;

public class Musicas<String> {

    private String nome;
    List<String> musicas = new LinkedList<>();

    public void addMusica(String nome){
        musicas.add(nome);
    }

    public void removerMusica(String nome){
        musicas.remove(nome);
    }
}
