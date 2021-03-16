package main.model;

import main.inteface.Beber;
import main.inteface.Orinar;

public class Vikingo extends Humano implements Beber, Orinar{

    private Integer bebedorProfesional;

    public Beber beberVikingo;
    public Orinar orinarVikingo;
    /*
    public Vikingo(String nombre, Integer edad, Integer peso, Integer bebedorProfesional) {
        super(nombre, edad, peso);
        this.bebedorProfesional = bebedorProfesional;
    }*/

    public Vikingo(Integer bebedorProfesional, Beber beberVikingo, Orinar orinarVikingo){
        this.bebedorProfesional =  bebedorProfesional;
        this.beberVikingo = beberVikingo;
        this.orinarVikingo =orinarVikingo;
    }

    public void beber(){
        beberVikingo.beber();
    }
    public void orinar(){
        orinarVikingo.orinar();
    }


}
