package AppleIphone;

import AppleIphone.MinhasMusicas.ReprodutorMusical;

public class Iphone {
    static private boolean ligado;

    static void ligarCelular(){
        if(!ligado){
            ligado = true;
            System.out.println("Bem vindo!!");
        }else{
            throw new IllegalStateException("Tentativa Invalida");
        }
    }

    static void desligarCelular(){
        if(ligado = true){
            System.out.println("Até logo!!");
            ligado = false;

        }else{
            throw new IllegalStateException("Tentativa Invalida");
        }
    }
}
