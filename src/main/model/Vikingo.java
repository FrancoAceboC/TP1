package main.model;

import main.inteface.Beber;
import main.inteface.Orinar;

import java.util.Objects;

public class Vikingo extends Humano implements Beber, Orinar{

    private Integer bebedorProfesional;

    public Beber beberVikingo;
    public Orinar orinarVikingo;

    public Vikingo(String nombre, Integer edad,  Integer peso, Integer bebedorProfesional, Beber beberVikingo, Orinar orinarVikingo) {
        super(nombre, edad, peso);
        this.bebedorProfesional = bebedorProfesional;
        this.beberVikingo = beberVikingo;
        this.orinarVikingo =orinarVikingo;
    }
//
//    public Vikingo(Integer bebedorProfesional, Beber beberVikingo, Orinar orinarVikingo){
//        this.bebedorProfesional =  bebedorProfesional;
//        this.beberVikingo = beberVikingo;
//        this.orinarVikingo =orinarVikingo;
//    }

    public void beber(){
        beberVikingo.beber();
    }
    public void orinar(){
        orinarVikingo.orinar();
    }

    @Override
    public String toString() {
        return "Vikingo{" +
                super.toString() +
                ", bebedorProfesional=" + bebedorProfesional +
                '}';
    }

    @Override
    public boolean equals(Object o) {


        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vikingo vikingo = (Vikingo) o;
        return Objects.equals(bebedorProfesional, vikingo.bebedorProfesional) && Objects.equals(beberVikingo, vikingo.beberVikingo) && Objects.equals(orinarVikingo, vikingo.orinarVikingo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bebedorProfesional, beberVikingo, orinarVikingo);
    }
}
