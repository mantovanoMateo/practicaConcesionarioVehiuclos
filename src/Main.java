import Contenedora.Concesionario;
import Models.Auto;
import Models.Moto;
import Models.Vehiculo;
import Models.Yate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Auto a1=new Auto("AAA123","audi","a1",12.5,4,4560000.0,"Asientos calefaccionados, direccion hidraulica y todos los chiches cheto maaal","Manual papa");
        Moto m1=new Moto("re trucha no tiene","Honda","C90",2.0,2,140000.0,90,true);
        Concesionario c1=new Concesionario();

        System.out.println("Ahora agregamos vehiculos");
        Boolean agregado=false;
        agregado=c1.agregarVehiculo(a1);
        if(agregado==true){
            System.out.println("agregado exitosamente");
        }else{
            System.out.println("ups... algo malo paso");
        }
        agregado=c1.agregarVehiculo(m1);
        if(agregado==true){
            System.out.println("agregado exitosamente");
        }else{
            System.out.println("ups... algo malo paso");
        }
        agregado=c1.agregarVehiculo(a1);
        if(agregado==true){
            System.out.println("agregado exitosamente");
        }else{
            System.out.println("ups... algo malo paso");
        }

        Vehiculo encontrado=null;
        System.out.println("Ahora  mostrarmos la lista de vehiculos: \n"+c1.devolverListado());
        encontrado=c1.buscarVehiculoPorPatente("AAA123");
        if(encontrado!=null){
            System.out.println("Vehiculo existente: "+ encontrado.toString());
        }

        System.out.println("Cantidad de vehiculos caragados "+ c1.contarVehiculos());

        System.out.println("Eliminamos un vehiculo ");
        Boolean eliminado=c1.eliminarPorPatente("AAA123");
        if(eliminado==true){
            System.out.println("eliminado con exito");
        }
        System.out.println(c1.devolverListado());
        c1.agregarVehiculo(a1);

        System.out.println("Crearemos unos Yates y luego pasaremos el stock total entre vehiculos y yates");
        Yate y1= new Yate(120,40,"Luxury 123");
        Yate y2= new Yate(300,60,"Luxury Fort super pro Mama cortaste toda la loz");
        c1.agregarYate(y1);
        c1.agregarYate(y2);

        System.out.println("El stock total entre yates y vehiculos es de : "+c1.calcularStock());


    }
}