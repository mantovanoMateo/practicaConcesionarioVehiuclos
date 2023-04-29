package Models;

public class Moto extends Vehiculo{
    private  Integer cilindrada;
    private  Boolean baulBajoAsiento;

    public Moto() {
    }

    public Moto(String patente, String marca, String modelo, Double consumoCombustible, Integer cantidadDeRuedas, Double precio, Integer cilindrada, Boolean baulBajoAsiento) {
        super(patente, marca, modelo, consumoCombustible, cantidadDeRuedas, precio);
        this.cilindrada = cilindrada;
        this.baulBajoAsiento = baulBajoAsiento;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrada=" + cilindrada +
                ", baulBajoAsiento=" + baulBajoAsiento +
                "} " + super.toString();
    }
}
