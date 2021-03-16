package main.implementacion;

import main.inteface.Beber;

public class BeberEspartanoImpl implements Beber {

    @Override
    public void beber() {
        System.out.println("Soy un espartano y estoy bebiendo");
    }
}
