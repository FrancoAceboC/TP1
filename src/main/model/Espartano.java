package main.model;

import main.inteface.Beber;
import main.inteface.Orinar;

public class Espartano extends Humano implements Beber, Orinar{

    private Integer toleranciaExtra;

    private Beber beberEspartano;
    private Orinar orinarEspartano;



    /*
    public Espartano(String nombre, Integer edad, Integer peso, Integer toleranciaExtra) {
        super(nombre, edad, peso);
        this.toleranciaExtra = toleranciaExtra;
    }*/

    public Espartano(Integer toleranciaExtra, Beber beberEspartano, Orinar orinarEspartano){
        this.toleranciaExtra = toleranciaExtra;
        this.beberEspartano = beberEspartano;
        this.orinarEspartano =orinarEspartano;
    }

    public Integer getToleranciaExtra() {
        return toleranciaExtra;
    }

    public void setToleranciaExtra(Integer toleranciaExtra) {
        this.toleranciaExtra = toleranciaExtra;
    }


    @Override
    public void beber() {
        beberEspartano.beber();
    }

    @Override
    public void orinar() {
        orinarEspartano.orinar();
    }
}
