package main.model;

import java.util.*;
import java.util.stream.Collectors;

public class Enfrentamiento <T>{

    private int dniUsuario;

    private List<Vikingo>vikingoList;
    private List<Espartano>espartanoList;

    int seguir = 1;

    Scanner sc = new Scanner(System.in);

    public Enfrentamiento(List<Vikingo>vikingoList, List<Espartano>espartanoList) {
        this.vikingoList = vikingoList;
        this.espartanoList = espartanoList;
    }

    public int getDniUsuario() {
        return dniUsuario;
    }

    public void setDniUsuario(int dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

    public List<Vikingo> getVikingoList() {
        return vikingoList;
    }

    public void setVikingoList(List<Vikingo> vikingoList) {
        this.vikingoList = vikingoList;
    }

    public List<Espartano> getEspartanoList() {
        return espartanoList;
    }

    public void setEspartanoList(List<Espartano> espartanoList) {
        this.espartanoList = espartanoList;
    }

    //------------------------------------------------------------------------------------------------------------------

    public void iniciarEnfrentamiento(){

        //-------------------------------------- INICIO DEL TORNEO------------------------------------------------------

        System.out.println("\n QUE ARRANQUE EL TORNEO DE FRESCAS!!! \n");

        //-------------------------------------------- DNI -------------------------------------------------------------

        System.out.println("Por favor ingrese su dni");
        dniUsuario = sc.nextInt();

        boolean comprobacion = comprobarDNI(dniUsuario); //  --> Si el DNI es par retorna true, si es impar false;
        //--------------------------------------------------------------------------------------------------------------
        //---------------------------WHILE POR SI DESEA MAS DE UN ENFRENTAMIENTO ---------------------------------------

        while (seguir == 1) {

            List<T>listaDeRetorno;
            listaDeRetorno = ordenarListaVikingosyEspartanos(comprobacion); // --> Ordena las listas dependiendo si el dni es par o impar
            //-------------------------------------------- VIKINGO SELECCIONADO ----------------------------------------
            Vikingo vikingoSeleccionado = (Vikingo) listaDeRetorno.get(0);
            System.out.println("\n El vikingo seleccionado es: " + vikingoSeleccionado.getNombre());
            //-------------------------------------------- ESPARTANO SELECCIONADO --------------------------------------
            Espartano espartanoSeleccionado = (Espartano) listaDeRetorno.get(1);
            System.out.println("\n El espartano seleccionado es: " + espartanoSeleccionado.getNombre());
            //-------------------------------------------- GANADOR DEL ENFRENTAMIENTO ----------------------------------
            T ganador = enfrentamiento(vikingoSeleccionado, espartanoSeleccionado);

            if(ganador instanceof Vikingo){
                Vikingo vikingoGanador = (Vikingo) ganador;
                System.out.println("Gano el vikingo: "+ vikingoGanador.getNombre());
            }else{
                Espartano espartanoGanador = (Espartano) ganador;
                System.out.println("Gano el espartano: "+ espartanoGanador.getNombre());
            }

            //-------------------------------------------- SI DESEA OTRO DUELO -----------------------------------------
            System.out.println("\n Desea presenciar otro duelo? ( 1-Si / 0-No )");
            seguir = sc.nextInt();
        }

        //-------------------------------------------------- FIN -------------------------------------------------------
        System.out.println("Muchas gracias, ha sido un placer");
    }
    //------------------------------------------------------------------------------------------------------------------
    //--------------------------------------- COMPROBACION DE DNI SI ES PAR O IMPAR ------------------------------------
    public boolean comprobarDNI(int dniUsuario){
        if (dniUsuario%2 == 0){
            return true;
        }else{
            return false;
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    //--------------------------------------- ORDENACION DE LISTA VIKINGOS Y ESPARTANOS --------------------------------
    public List<T> ordenarListaVikingosyEspartanos(boolean comprobacion){

        List<T>listaRetorno = new ArrayList<>();

        if (comprobacion == true){
            //DNI PAR
            //ORDENAR LISTAS POR EDAD

            List<Vikingo> vikingosPorEdad = vikingoList.stream()
                    .sorted(Comparator.comparing(Vikingo::getEdad))
                    .collect(Collectors.toList());

            System.out.println("\n Vikingos ordenados por edad: \n");
            for (Vikingo v:vikingosPorEdad) {
                System.out.println("Nombre: "+v.getNombre() + "- Edad:" + v.getEdad());
            }


            Vikingo vikingo = vikingoAleatorio();
            listaRetorno.add((T) vikingo);

            List<Espartano> espartanosPorEdad = espartanoList.stream()
                    .sorted(Comparator.comparing(Espartano::getEdad))
                    .collect(Collectors.toList());

            System.out.println(" \n Espartanos ordenados por edad: \n");
            for (Espartano e:espartanosPorEdad) {
                System.out.println("Nombre: "+e.getNombre() + "- Edad:" + e.getEdad());
            }

            Espartano espartano = espartanoAleatorio();
            listaRetorno.add((T) espartano);

        }else if (comprobacion == false){
            //DNI IMPAR
            //ORDENAR LISTAS POR PESO

            List<Vikingo> vikingosPorPeso = vikingoList.stream()
                    .sorted(Comparator.comparing(Vikingo::getPeso))
                    .collect(Collectors.toList());

            System.out.println("\n Vikingos ordenados por peso: \n");
            for (Vikingo v:vikingosPorPeso) {
                System.out.println("Nombre: "+v.getNombre() + "- Peso:" + v.getPeso());
            }

            Vikingo vikingo = vikingoList.get(0);
            listaRetorno.add((T) vikingo);

            List<Espartano> espartanosPorPeso = espartanoList.stream()
                    .sorted(Comparator.comparing(Espartano::getPeso))
                    .collect(Collectors.toList());

            System.out.println("\n Esparatanos ordenados por peso: \n");
            for (Espartano e:espartanosPorPeso) {
                System.out.println("Nombre: "+e.getNombre() + "- Peso:" + e.getPeso());
            }

            Espartano espartano = espartanoList.get(0);
            listaRetorno.add((T) espartano);
        }
        return listaRetorno;
    }

    //------------------------------------------------------------------------------------------------------------------
    //--------------------------------------- VIKINGO Y ESPARTANO ALEATORIO --------------------------------------------

    public Vikingo vikingoAleatorio(){
        Random random = new Random();
        int index = random.nextInt(this.vikingoList.size());
        return this.vikingoList.get(index);
    }
        public Espartano espartanoAleatorio(){
            Random random = new Random();
            int index = random.nextInt(this.espartanoList.size());
            return this.espartanoList.get(index);
    }

    //------------------------------------------------------------------------------------------------------------------
    //--------------------------------------- ENFRENTAMIENTO Y GANADOR ALEATORIO ---------------------------------------

    public T enfrentamiento(Vikingo vikingo, Espartano espartano){

        System.out.println("\n QUE ARRANQUE EL DUELO \n");
        List<T>enfrentamiento = new ArrayList<>();
        enfrentamiento.add((T) vikingo);
        enfrentamiento.add((T) espartano);


        int random = (int) Math.floor(Math.random()*(enfrentamiento.size()));
        T ganador = enfrentamiento.get(random);

        return ganador;

    }
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
}