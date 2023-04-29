package Contenedora;

import Models.Auto;
import Models.Vehiculo;
import Models.Yate;

import java.util.ArrayList;

public class Concesionario {
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Yate> yates;

    public Concesionario() {
        this.vehiculos = new ArrayList<>();
        this.yates=new ArrayList<>();
    }

    public Boolean agregarVehiculo(Vehiculo nuevo){
        Boolean agregado=false;
        if(buscarVehiculoPorPatente(nuevo.getPatente())==null){
            agregado=true;
            vehiculos.add(nuevo);
        }
        return agregado;
    }

    public void agregarYate(Yate nuevo){
        yates.add(nuevo);
    }


    public Vehiculo buscarVehiculoPorPatente(String patente){
        int i=0;
        Vehiculo encontrado=null;
        while(i<vehiculos.size() && encontrado == null){
            if(vehiculos.get(i).getPatente().equals(patente)){
                encontrado=vehiculos.get(i);
            }else{
                i++;
            }
        }
        return encontrado;
    }

    public Integer contarVehiculos(){
        Integer i=0;
        for(Vehiculo vehiculo: vehiculos){
            i++;
        }
        return i;
    }

    public String devolverListado(){
        String listado="Aun no se ha ingresado ningun vehiculo";
        if(!vehiculos.isEmpty()){
            listado="";
            for(Vehiculo vehiculo: vehiculos){
                listado+=vehiculo.toString()+"\n";
            }
        }
        return listado;
    }

    public Boolean eliminarPorPatente(String patente){
        Boolean eliminado=false;
        Vehiculo encontrado=null;
        encontrado=buscarVehiculoPorPatente(patente);
        if(encontrado!=null){
            vehiculos.remove(encontrado);
            eliminado=true;
        }
        return eliminado;
    }

    public Integer calcularStock(){
        Integer i=0;
        for(Vehiculo vehiculo: vehiculos){
            i++;
        }
        for(Yate yate: yates){
            i++;
        }
        return i;
    }

}
