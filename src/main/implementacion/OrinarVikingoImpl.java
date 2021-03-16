package main.implementacion;

import main.inteface.Orinar;

public class OrinarVikingoImpl implements Orinar {

    @Override
    public void orinar() {
        System.out.println("Soy un vikingo y estoy meando");
    }
}
