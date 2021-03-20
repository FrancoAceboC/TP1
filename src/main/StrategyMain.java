package main;

import main.implementacion.BeberEspartanoImpl;
import main.implementacion.BeberVikingoImpl;
import main.implementacion.OrinarEspartanoImpl;
import main.implementacion.OrinarVikingoImpl;
import main.model.Enfrentamiento;
import main.model.Espartano;
import main.model.Vikingo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StrategyMain {

    public static void main(String[] args) {

        List<Vikingo> listaVikingo = new LinkedList<>();
        List<Espartano> listaEspartano = new LinkedList<>();

        Vikingo vikingo = new Vikingo("Vikingo1", 40, 80, 3, new BeberVikingoImpl(), new OrinarVikingoImpl());
        Vikingo vikingo2 = new Vikingo("Vikingo2", 50, 90, 2, new BeberVikingoImpl(), new OrinarVikingoImpl());
        Vikingo vikingo3 = new Vikingo("Vikingo3", 60, 101, 3, new BeberVikingoImpl(), new OrinarVikingoImpl());
        Vikingo vikingo4 = new Vikingo("Vikingo4", 80, 115, 5, new BeberVikingoImpl(), new OrinarVikingoImpl());
        Vikingo vikingo5 = new Vikingo("Vikingo5", 30, 93, 1, new BeberVikingoImpl(), new OrinarVikingoImpl());
        Vikingo vikingo6 = new Vikingo("Vikingo6", 55, 84, 3, new BeberVikingoImpl(), new OrinarVikingoImpl());
        Vikingo vikingo7 = new Vikingo("Vikingo7", 63, 87, 2, new BeberVikingoImpl(), new OrinarVikingoImpl());
        Vikingo vikingo8 = new Vikingo("Vikingo8", 19, 69, 1, new BeberVikingoImpl(), new OrinarVikingoImpl());

        listaVikingo.add(vikingo);
        listaVikingo.add(vikingo2);
        listaVikingo.add(vikingo3);
        listaVikingo.add(vikingo4);
        listaVikingo.add(vikingo5);
        listaVikingo.add(vikingo6);
        listaVikingo.add(vikingo7);
        listaVikingo.add(vikingo8);

        Espartano espartano = new Espartano("Espartano1", 20, 71, 5, new BeberEspartanoImpl(), new OrinarEspartanoImpl());
        Espartano espartano2 = new Espartano("Espartano2", 80, 66, 2, new BeberEspartanoImpl(), new OrinarEspartanoImpl());
        Espartano espartano3 = new Espartano("Espartano3", 60, 66, 3, new BeberEspartanoImpl(), new OrinarEspartanoImpl());
        Espartano espartano4 = new Espartano("Espartano4", 70, 102, 4, new BeberEspartanoImpl(), new OrinarEspartanoImpl());
        Espartano espartano5 = new Espartano("Espartano5", 40, 112, 1, new BeberEspartanoImpl(), new OrinarEspartanoImpl());
        Espartano espartano6 = new Espartano("Espartano6", 30, 98, 3, new BeberEspartanoImpl(), new OrinarEspartanoImpl());
        Espartano espartano7 = new Espartano("Espartano7", 20, 87, 1, new BeberEspartanoImpl(), new OrinarEspartanoImpl());
        Espartano espartano8 = new Espartano("Espartano8", 50, 78, 2, new BeberEspartanoImpl(), new OrinarEspartanoImpl());

        listaEspartano.add(espartano);
        listaEspartano.add(espartano2);
        listaEspartano.add(espartano3);
        listaEspartano.add(espartano4);
        listaEspartano.add(espartano5);
        listaEspartano.add(espartano6);
        listaEspartano.add(espartano7);
        listaEspartano.add(espartano8);

        Enfrentamiento enfrentamiento = new Enfrentamiento(listaVikingo, listaEspartano);
        enfrentamiento.iniciarEnfrentamiento();


    }
}
