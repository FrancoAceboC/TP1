package main.implementacion;

import main.inteface.Orinar;

public class OrinarEspartanoImpl implements Orinar {

    @Override
    public void orinar() {
        System.out.println("Soy un espartano y estoy meando");
    }
}
