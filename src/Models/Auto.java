package Models;

public class Auto extends Vehiculo{
    private String listaPrestaciones;
    private String tipoCajaDeCambios;

    public Auto() {
    }

    public Auto(String patente, String marca, String modelo, Double consumoCombustible, Integer cantidadDeRuedas, Double precio, String listaPrestaciones, String tipoCajaDeCambios) {
        super(patente, marca, modelo, consumoCombustible, cantidadDeRuedas, precio);
        this.listaPrestaciones = listaPrestaciones;
        this.tipoCajaDeCambios = tipoCajaDeCambios;
    }

    public String getListaPrestaciones() {
        return listaPrestaciones;
    }

    public String getTipoCajaDeCambios() {
        return tipoCajaDeCambios;
    }

    public void setListaPrestaciones(String listaPrestaciones) {
        this.listaPrestaciones = listaPrestaciones;
    }

    public void setTipoCajaDeCambios(String tipoCajaDeCambios) {
        this.tipoCajaDeCambios = tipoCajaDeCambios;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "listaPrestaciones='" + listaPrestaciones + '\'' +
                ", tipoCajaDeCambios='" + tipoCajaDeCambios + '\'' +
                "} " + super.toString();
    }
}
