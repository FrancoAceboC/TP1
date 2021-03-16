package main.implementacion;

import main.inteface.Beber;

public class BeberVikingoImpl implements Beber {

    @Override
    public void beber() {
        System.out.println("Soy un vikingo y estoy bebiendo");
    }
}
