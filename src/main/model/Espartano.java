package main.model;

import main.inteface.Beber;
import main.inteface.Orinar;

import java.util.List;
import java.util.Objects;

public class Espartano extends Humano implements Beber, Orinar{

    private Integer toleranciaExtra;

    private Beber beberEspartano;
    private Orinar orinarEspartano;

    public Espartano(String nombre, Integer edad, Integer peso,  Integer toleranciaExtra, Beber beberEspartano, Orinar orinarEspartano) {
        super(nombre, edad, peso);
        this.toleranciaExtra = toleranciaExtra;
        this.beberEspartano = beberEspartano;
        this.orinarEspartano =orinarEspartano;
    }
    /*
    public Espartano(Integer toleranciaExtra, Beber beberEspartano, Orinar orinarEspartano){
        this.toleranciaExtra = toleranciaExtra;
        this.beberEspartano = beberEspartano;
        this.orinarEspartano =orinarEspartano;
    }*/

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

    @Override
    public String toString() {
        return "Espartano{" +
                super.toString() +
                "toleranciaExtra=" + toleranciaExtra +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Espartano espartano = (Espartano) o;
        return Objects.equals(toleranciaExtra, espartano.toleranciaExtra) && Objects.equals(beberEspartano, espartano.beberEspartano) && Objects.equals(orinarEspartano, espartano.orinarEspartano);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toleranciaExtra, beberEspartano, orinarEspartano);
    }
}
