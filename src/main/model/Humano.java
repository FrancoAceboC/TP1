package main.model;

import main.inteface.Beber;
import main.inteface.Orinar;

import java.util.Objects;

public abstract class Humano {

    protected String nombre;
    protected Integer edad;
    protected Integer peso;



    public Humano(String nombre, Integer edad, Integer peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;

    }

    public Humano() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return
                "Nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Humano humano = (Humano) o;
        return Objects.equals(nombre, humano.nombre) && Objects.equals(edad, humano.edad) && Objects.equals(peso, humano.peso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, peso);
    }
}
