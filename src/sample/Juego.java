package sample;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Juego  {

    ArrayList<String> words = new ArrayList<>();
    boolean arrayWordsLleno = false;


    public Juego() {
        addWords();
    }

    public String randomWord(){

        if (arrayWordsLleno){
            int random = (int) Math.floor(Math.random()*50);
            return words.get(random);
        }else{
            return "Sin palabras";
        }


    }
    public void addWords(){
        words.add("hola");
        words.add("papa");
        words.add("cristo");
        words.add("tabla");
        words.add("piso");
        words.add("mama");
        words.add("clase");
        words.add("java");
        words.add("pantalla");
        words.add("escena");

        words.add("pelo");
        words.add("hasta");
        words.add("abrir");
        words.add("cerrar");
        words.add("casi");
        words.add("palabra");
        words.add("android");
        words.add("ver");
        words.add("hacer");
        words.add("funciones");

        words.add("dibujo");
        words.add("parar");
        words.add("control");
        words.add("datos");
        words.add("llamada");
        words.add("activar");
        words.add("nuevo");
        words.add("ojo");
        words.add("teoria");
        words.add("boton");

        words.add("cancelar");
        words.add("anterior");
        words.add("instagram");
        words.add("cable");
        words.add("ordenador");
        words.add("raton");
        words.add("torre");
        words.add("web");
        words.add("pagina");
        words.add("venir");

        words.add("colgar");
        words.add("necesitar");
        words.add("politica");
        words.add("reloj");
        words.add("hora");
        words.add("funcion");
        words.add("palo");
        words.add("polo");
        words.add("piso");
        words.add("casa");

        arrayWordsLleno = true;
    }


}
