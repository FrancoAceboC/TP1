package main;

import main.implementacion.BeberEspartanoImpl;
import main.implementacion.BeberVikingoImpl;
import main.implementacion.OrinarEspartanoImpl;
import main.implementacion.OrinarVikingoImpl;
import main.model.Espartano;
import main.model.Vikingo;

public class StrategyMain {

    public static void main(String[] args) {

        Vikingo vikingo = new Vikingo(3, new BeberVikingoImpl(), new OrinarVikingoImpl());
        vikingo.orinar();

        Espartano espartano = new Espartano(5, new BeberEspartanoImpl(), new OrinarEspartanoImpl());
        espartano.orinar();
    }
}
